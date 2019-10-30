package com.bng.rd.xmlrpcconnexion.models;

/**
 * Created by Hermann KOUADIO on 10/29/2019.
 */
public class BaseModel {
    private long id;
    private String write_uid;
    private String write_date;
    private String create_date;
    private String create_uid;
    private String __last_update;

    public BaseModel() {
    }

    public BaseModel(long id) {
        this.id = id;
    }

    public BaseModel(String write_uid, String write_date, String create_date, String create_uid, String __last_update) {
        this.write_uid = write_uid;
        this.write_date = write_date;
        this.create_date = create_date;
        this.create_uid = create_uid;
        this.__last_update = __last_update;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWrite_uid() {
        return write_uid;
    }

    public void setWrite_uid(String write_uid) {
        this.write_uid = write_uid;
    }

    public String getWrite_date() {
        return write_date;
    }

    public void setWrite_date(String write_date) {
        this.write_date = write_date;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getCreate_uid() {
        return create_uid;
    }

    public void setCreate_uid(String create_uid) {
        this.create_uid = create_uid;
    }

    public String get__last_update() {
        return __last_update;
    }

    public void set__last_update(String __last_update) {
        this.__last_update = __last_update;
    }
}
