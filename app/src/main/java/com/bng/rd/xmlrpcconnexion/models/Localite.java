package com.bng.rd.xmlrpcconnexion.models;

/**
 * Created by Hermann KOUADIO on 10/29/2019.
 */
public class Localite extends BaseModel {
    private String contactAsc;
    private String displayName;
    private String nameAsc;
    private String prenomAsc;
    private String libelleLocalite;
    private String prefessionAsc;
    private AireLocalite aireLocalite;
    private RegionLocalite regionLocalite;
    private String checkGroup;
    private DistrictLocalite districLocalite;

    public Localite() {
    }

    public Localite(String write_uid, String write_date, String create_date, String create_uid,
                    String __last_update, String contactAsc, String displayName, String nameAsc,
                    String prenomAsc, String libelleLocalite, String prefessionAsc,
                    AireLocalite aireLocalite, String checkGroup, DistrictLocalite districLocalite, RegionLocalite regionLocalite) {
        super(write_uid, write_date, create_date, create_uid, __last_update);
        this.contactAsc = contactAsc;
        this.displayName = displayName;
        this.nameAsc = nameAsc;
        this.prenomAsc = prenomAsc;
        this.libelleLocalite = libelleLocalite;
        this.prefessionAsc = prefessionAsc;
        this.checkGroup = checkGroup;
        this.aireLocalite = aireLocalite;
        this.districLocalite = districLocalite;
        this.regionLocalite = regionLocalite;
    }

    public String getContactAsc() {
        return contactAsc;
    }

    public void setContactAsc(String contactAsc) {
        this.contactAsc = contactAsc;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getNameAsc() {
        return nameAsc;
    }

    public void setNameAsc(String nameAsc) {
        this.nameAsc = nameAsc;
    }

    public String getPrenomAsc() {
        return prenomAsc;
    }

    public void setPrenomAsc(String prenomAsc) {
        this.prenomAsc = prenomAsc;
    }

    public String getLibelleLocalite() {
        return libelleLocalite;
    }

    public void setLibelleLocalite(String libelleLocalite) {
        this.libelleLocalite = libelleLocalite;
    }

    public String getPrefessionAsc() {
        return prefessionAsc;
    }

    public void setPrefessionAsc(String prefessionAsc) {
        this.prefessionAsc = prefessionAsc;
    }

    public AireLocalite getAireLocalite() {
        return aireLocalite;
    }

    public void setAireLocalite(AireLocalite aireLocalite) {
        this.aireLocalite = aireLocalite;
    }

    public String getCheckGroup() {
        return checkGroup;
    }

    public void setCheckGroup(String checkGroup) {
        this.checkGroup = checkGroup;
    }

    public DistrictLocalite getDistricLocalite() {
        return districLocalite;
    }

    public void setDistricLocalite(DistrictLocalite districLocalite) {
        this.districLocalite = districLocalite;
    }

    public RegionLocalite getRegionLocalite() {
        return regionLocalite;
    }

    public void setRegionLocalite(RegionLocalite regionLocalite) {
        this.regionLocalite = regionLocalite;
    }
}
