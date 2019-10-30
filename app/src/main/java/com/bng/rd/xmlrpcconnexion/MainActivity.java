package com.bng.rd.xmlrpcconnexion;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.bng.rd.xmlrpcconnexion.models.AireLocalite;
import com.bng.rd.xmlrpcconnexion.models.DistrictLocalite;
import com.bng.rd.xmlrpcconnexion.models.Localite;
import com.bng.rd.xmlrpcconnexion.models.RegionLocalite;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import androidx.appcompat.app.AppCompatActivity;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final String url = "https://mvaccin.jconsultci.com", db = "mvaccin",
            username = "alex@mvaccin.net", password = "admin";
    List<Object> list;
    private TextView textView;
    private Button btnCount, btnAddNew;
    private EditText modelName;
    int uid = 0;
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
        btnAddNew = findViewById(R.id.btn_new);

        btnCount.setOnClickListener(this);
        btnAddNew.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_count:
                searchItem();
                break;
            case R.id.btn_new:
                Log.i(TAG, String.valueOf(addNew()));
                break;
            default:
                Log.i(TAG, "RAS");
                break;
        }
    }

    private int addNew(Localite localite) {
        final int[] rec_id = new int[1];

        new Thread(() -> {

            // Common config
            final XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
            // Call method
            final XmlRpcClient models = new XmlRpcClient() {{
                setConfig(new XmlRpcClientConfigImpl() {{
                    try {
                        setServerURL(new URL(String.format("%s/xmlrpc/2/object", url)));
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }});
            }};
            int uid = authenticate(models, config);
            try {
                rec_id[0] = ((Integer) models.execute("execute_kw", asList(
                        db, uid, password,
                        modelName.getText().toString().toLowerCase(), "create",
                        asList(new HashMap<String, String>() {{
                            put("nom_asc", "Test");
                            put("prenom_asc", "Record");
                            put("display_name", "Test Record");
                            put("contact_asc", "45 67 98 09");
                            put("libelle_localite", "Cocody");
                            put("profession_asc", "Developpeur");
                            put("check_group", "6");
                            put("aire_localite", "1");
                            put("district_localite", "1");
                            put("region_localite", "1");
                            put("controle_contact_mere_tuteur", "");
                        }})
                )));
            } catch (XmlRpcException e) {
                e.printStackTrace();
            }
        }).start();
        return rec_id[0];
    }

    private int addNew() {
        final int[] rec_id = new int[1];
        new Thread(() -> {
            // Client
            final XmlRpcClient client = new XmlRpcClient();
            // Common config
            final XmlRpcClientConfigImpl common_config = new XmlRpcClientConfigImpl();
            // Call method
            final XmlRpcClient models = new XmlRpcClient() {{
                setConfig(new XmlRpcClientConfigImpl() {{
                    try {
                        setServerURL(new URL(String.format("%s/xmlrpc/2/object", url)));
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }});
            }};
            try {
                common_config.setServerURL(
                        new URL(String.format("%s/xmlrpc/2/common", url)));
                final Map<String, String> info1 = (Map<String, String>) client.execute(common_config, "version", emptyList());

                Log.e("INFO1", info1.toString());
                uid = authenticate(client, common_config);

                rec_id[0] = (Integer) models.execute("execute_kw", asList(
                        db, uid, password,
                        modelName.getText().toString().toLowerCase(), "create",
                        asList(new HashMap<String, Object>() {{
                            /*put("nom_asc", "Test");
                            put("prenom_asc", "Record");*/
                            put("display_name", "Language");
                            /*put("contact_asc", "45 67 98 09");
                            put("libelle_localite", "Cocody");
                            put("profession_asc", "Developpeur");
                            put("check_group", "6");
                            put("aire_localite", "1");
                            put("district_localite", "1");
                            put("region_localite", "1");
                            put("controle_contact_mere_tuteur", "");*/

                        }})
                ));

            } catch (XmlRpcException | MalformedURLException e) {
                e.printStackTrace();
            }
        }).

                start();
        return rec_id[0];
    }


    private void searchItem() {
        new Thread(() -> {
            // Client
            final XmlRpcClient client = new XmlRpcClient();
            // Common config
            final XmlRpcClientConfigImpl common_config = new XmlRpcClientConfigImpl();
            // Call method
            final XmlRpcClient models = new XmlRpcClient() {{
                setConfig(new XmlRpcClientConfigImpl() {{
                    try {
                        setServerURL(new URL(String.format("%s/xmlrpc/2/object", url)));
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }});
            }};
            try {
                common_config.setServerURL(
                        new URL(String.format("%s/xmlrpc/2/common", url)));
                final Map<String, String> info1 = (Map<String, String>) client.execute(common_config, "version", emptyList());

                Log.e("INFO1", info1.toString());
                uid = authenticate(client, common_config);

                Log.e("Model Name", modelName.getText().toString().toLowerCase());

                list = asList((Object[]) models.execute("execute_kw", asList(
                        db, uid, password,
                        modelName.getText().toString().toLowerCase(), "search_read",
                        asList(asList(
                                asList("id", "!=", 0)/*,
                                    asList("customer", "=", true)*/))
                )));
                textView.post(() ->
                        textView.setText(String.valueOf(list.size()))
                );
                ArrayList<Localite> localites = new ArrayList<>();

                /*list.forEach(c -> {
                            Localite localite = new Localite();
                            // Set attributes
                            long l = ((HashMap<String, Integer>) c).get("id").intValue();
                            localite.setId(l);

                            String s = ((HashMap<String, String>) c).get("contact_asc");
                            localite.setContactAsc(s);

                            s = ((HashMap<String, String>) c).get("display_name");
                            localite.setDisplayName(s);

                            s = ((HashMap<String, String>) c).get("prenom_asc");
                            localite.setPrenomAsc(s);

                            s = ((HashMap<String, String>) c).get("nom_asc");
                            localite.setNameAsc(s);

                            s = ((HashMap<String, String>) c).get("libelle_localite");
                            localite.setLibelleLocalite(s);

                            s = ((HashMap<String, String>) c).get("check_group");
                            localite.setCheckGroup(s);

                            Object[] aire_localite = ((HashMap<String, Object[]>) c).get("aire_localite");
                            localite.setAireLocalite(new AireLocalite(Long.parseLong(aire_localite[0].toString()), aire_localite[1].toString()));

                            Object[] district_localite = ((HashMap<String, Object[]>) c).get("district_localite");
                            localite.setDistricLocalite(new DistrictLocalite(Long.parseLong(district_localite[0].toString()), district_localite[1].toString()));

                            Object[] region_localite = ((HashMap<String, Object[]>) c).get("region_localite");
                            localite.setRegionLocalite(new RegionLocalite(Long.parseLong(region_localite[0].toString()), region_localite[1].toString()));

                            // Add In List
                            localites.add(localite);
                        }
                );*/
            } catch (XmlRpcException | MalformedURLException e) {
                e.printStackTrace();
            }
        }).

                start();
    }

    private int authenticate(XmlRpcClient client, XmlRpcClientConfigImpl config) {
        try {
            uid = (int) client.execute(
                    config, "authenticate", asList(
                            db, username, password, emptyMap()));
        } catch (XmlRpcException e) {
            e.printStackTrace();
        }
        Log.e("UID", String.valueOf(uid));
        return uid;
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
