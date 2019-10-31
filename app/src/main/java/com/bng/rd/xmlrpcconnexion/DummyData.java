package com.bng.rd.xmlrpcconnexion;

import com.bng.rd.xmlrpcconnexion.models.BaseModel;
import com.bng.rd.xmlrpcconnexion.models.CalendarEvent;
import com.bng.rd.xmlrpcconnexion.models.Grossesse;
import com.bng.rd.xmlrpcconnexion.models.Langue;
import com.bng.rd.xmlrpcconnexion.models.Localite;
import com.bng.rd.xmlrpcconnexion.models.Partner;

/**
 * Created by Hermann KOUADIO on 10/30/2019.
 */
public class DummyData {

    public static BaseModel clss;

    public static Grossesse grossesse = new Grossesse();
    public static Langue langue = new Langue();
    public static Localite localite = new Localite();
    public static Partner partner = new Partner();
    public static CalendarEvent calendarEvent = new CalendarEvent();
}
