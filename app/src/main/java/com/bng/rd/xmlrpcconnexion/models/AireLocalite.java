package com.bng.rd.xmlrpcconnexion.models;

/**
 * Created by Hermann KOUADIO on 10/29/2019.
 */
public class AireLocalite extends BaseModel {
    private String name;

    public AireLocalite() {
    }

    public AireLocalite(long id, String name) {
        super(id);
        this.name = name;
    }

    public AireLocalite(String write_uid, String write_date, String create_date, String create_uid, String __last_update, String name) {
        super(write_uid, write_date, create_date, create_uid, __last_update);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
