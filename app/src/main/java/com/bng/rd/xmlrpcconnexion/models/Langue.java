package com.bng.rd.xmlrpcconnexion.models;

/**
 * Created by Hermann KOUADIO on 10/30/2019.
 */
public class Langue extends BaseModel {
    private String displayName;

    public Langue(){}

    public Langue(String displayName) {
        this.displayName = displayName;
    }

    public Langue(long id, String displayName) {
        super(id);
        this.displayName = displayName;
    }

    public Langue(String write_uid, String write_date, String create_date, String create_uid, String __last_update, String displayName) {
        super(write_uid, write_date, create_date, create_uid, __last_update);
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
