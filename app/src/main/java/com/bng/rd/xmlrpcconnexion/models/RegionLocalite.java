package com.bng.rd.xmlrpcconnexion.models;

/**
 * Created by Hermann KOUADIO on 10/29/2019.
 */
public class RegionLocalite extends BaseModel {
    private String name;

    public RegionLocalite() {
    }

    public RegionLocalite(long id, String name) {
        super(id);
        this.name = name;
    }

    public RegionLocalite(String write_uid, String write_date, String create_date, String create_uid, String __last_update, String name) {
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
