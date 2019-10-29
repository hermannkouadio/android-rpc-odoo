package com.bng.rd.xmlrpcconnexion;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import androidx.appcompat.app.AppCompatActivity;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final String url = "url", db = "db",
            username = "usermane", password = "pwd";
    List<Object> list;
    private TextView textView;
    private Button btnCount;
    private EditText modelName;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        textView = findViewById(R.id.counter);
        btnCount = findViewById(R.id.btn_count);
        modelName = findViewById(R.id.model_name);

        btnCount.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_count:
                searchItem();
                break;
            default:
                Log.i(TAG, "RAS");
                break;
        }
    }

    private void searchItem() {
        new Thread(() -> {
            final XmlRpcClient client = new XmlRpcClient();
            final XmlRpcClientConfigImpl common_config = new XmlRpcClientConfigImpl();

            try {
                common_config.setServerURL(
                        new URL(String.format("%s/xmlrpc/2/common", url)));
                final Map<String, String> info1 = (Map<String, String>) client.execute(common_config, "version", emptyList());

                Log.e("INFO1", info1.toString());

                int uid = (int) client.execute(
                        common_config, "authenticate", asList(
                                db, username, password, emptyMap()));
                Log.e("UID", String.valueOf(uid));

                final XmlRpcClient models = new XmlRpcClient() {{
                    setConfig(new XmlRpcClientConfigImpl() {{
                        setServerURL(new URL(String.format("%s/xmlrpc/2/object", url)));
                    }});
                }};

                Log.e("Model Name", modelName.getText().toString().toLowerCase());

                list = asList((Object[]) models.execute("execute_kw", asList(
                        db, uid, password,
                        modelName.getText().toString().toLowerCase(), "search",
                        asList(asList(
                                asList("id", "!=", 0)/*,
                                    asList("customer", "=", true)*/))
                )));
                textView.post(() ->
                        textView.setText(String.valueOf(list.size()))
                );
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (XmlRpcException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private class UpdateTextViewAsync extends AsyncTask {

        @Override
        protected Object doInBackground(Object[] objects) {
            return null;
        }

        protected void onPostExecute(String newValue) {
            textView.setText(newValue);
        }
    }

}
