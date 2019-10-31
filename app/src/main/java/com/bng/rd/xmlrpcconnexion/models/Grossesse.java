package com.bng.rd.xmlrpcconnexion.models;

/**
 * Created by Hermann KOUADIO on 10/30/2019.
 */
public class Grossesse extends BaseModel {

    private Boolean femmeEnceinteSort;
    private String dteNaisMereGrosesse;
    private DistrictLocalite districtGrossesse;
    private Boolean regionExecution;
    private String telMereGrosesse;
    private String positionMereGrosesse;
    private String registreGrosesse;
    private Boolean districtExecution;
    private Boolean registreNumMereGrosesse;
    private Boolean motifInterruptionGrosesse;
    private RegionLocalite regionGrosesse;
    private Femme femmeEnceinte2;
    private Boolean termePrevu;
    private String state;
    private Boolean checkMvaccinMereGrosesse;
    private String dteCreationGrossesse;
    private Femme femmeEnceinte;
    private AireLocalite aireGrossese;
    private Integer nbreSemaine;
    private Boolean aireExecution;
    private Boolean localiteMereGrosesse;
    private String prenomMereGrosesse;

    public Grossesse(){}

    public Grossesse(Boolean femmeEnceinteSort, String dteNaisMereGrosesse, DistrictLocalite districtGrossesse, Boolean regionExecution, String telMereGrosesse, String positionMereGrosesse, String registreGrosesse, Boolean districtExecution, Boolean registreNumMereGrosesse, Boolean motifInterruptionGrosesse, RegionLocalite regionGrosesse, Femme femmeEnceinte2, Boolean termePrevu, String state, Boolean checkMvaccinMereGrosesse, String dteCreationGrossesse, Femme femmeEnceinte, AireLocalite aireGrossese, Integer nbreSemaine, Boolean aireExecution, Boolean localiteMereGrosesse, String prenomMereGrosesse) {
        this.femmeEnceinteSort = femmeEnceinteSort;
        this.dteNaisMereGrosesse = dteNaisMereGrosesse;
        this.districtGrossesse = districtGrossesse;
        this.regionExecution = regionExecution;
        this.telMereGrosesse = telMereGrosesse;
        this.positionMereGrosesse = positionMereGrosesse;
        this.registreGrosesse = registreGrosesse;
        this.districtExecution = districtExecution;
        this.registreNumMereGrosesse = registreNumMereGrosesse;
        this.motifInterruptionGrosesse = motifInterruptionGrosesse;
        this.regionGrosesse = regionGrosesse;
        this.femmeEnceinte2 = femmeEnceinte2;
        this.termePrevu = termePrevu;
        this.state = state;
        this.checkMvaccinMereGrosesse = checkMvaccinMereGrosesse;
        this.dteCreationGrossesse = dteCreationGrossesse;
        this.femmeEnceinte = femmeEnceinte;
        this.aireGrossese = aireGrossese;
        this.nbreSemaine = nbreSemaine;
        this.aireExecution = aireExecution;
        this.localiteMereGrosesse = localiteMereGrosesse;
        this.prenomMereGrosesse = prenomMereGrosesse;
    }

    public Grossesse(long id, Boolean femmeEnceinteSort, String dteNaisMereGrosesse, DistrictLocalite districtGrossesse, Boolean regionExecution, String telMereGrosesse, String positionMereGrosesse, String registreGrosesse, Boolean districtExecution, Boolean registreNumMereGrosesse, Boolean motifInterruptionGrosesse, RegionLocalite regionGrosesse, Femme femmeEnceinte2, Boolean termePrevu, String state, Boolean checkMvaccinMereGrosesse, String dteCreationGrossesse, Femme femmeEnceinte, AireLocalite aireGrossese, Integer nbreSemaine, Boolean aireExecution, Boolean localiteMereGrosesse, String prenomMereGrosesse) {
        super(id);
        this.femmeEnceinteSort = femmeEnceinteSort;
        this.dteNaisMereGrosesse = dteNaisMereGrosesse;
        this.districtGrossesse = districtGrossesse;
        this.regionExecution = regionExecution;
        this.telMereGrosesse = telMereGrosesse;
        this.positionMereGrosesse = positionMereGrosesse;
        this.registreGrosesse = registreGrosesse;
        this.districtExecution = districtExecution;
        this.registreNumMereGrosesse = registreNumMereGrosesse;
        this.motifInterruptionGrosesse = motifInterruptionGrosesse;
        this.regionGrosesse = regionGrosesse;
        this.femmeEnceinte2 = femmeEnceinte2;
        this.termePrevu = termePrevu;
        this.state = state;
        this.checkMvaccinMereGrosesse = checkMvaccinMereGrosesse;
        this.dteCreationGrossesse = dteCreationGrossesse;
        this.femmeEnceinte = femmeEnceinte;
        this.aireGrossese = aireGrossese;
        this.nbreSemaine = nbreSemaine;
        this.aireExecution = aireExecution;
        this.localiteMereGrosesse = localiteMereGrosesse;
        this.prenomMereGrosesse = prenomMereGrosesse;
    }

    public Grossesse(String write_uid, String write_date, String create_date, String create_uid, String __last_update, Boolean femmeEnceinteSort, String dteNaisMereGrosesse, DistrictLocalite districtGrossesse, Boolean regionExecution, String telMereGrosesse, String positionMereGrosesse, String registreGrosesse, Boolean districtExecution, Boolean registreNumMereGrosesse, Boolean motifInterruptionGrosesse, RegionLocalite regionGrosesse, Femme femmeEnceinte2, Boolean termePrevu, String state, Boolean checkMvaccinMereGrosesse, String dteCreationGrossesse, Femme femmeEnceinte, AireLocalite aireGrossese, Integer nbreSemaine, Boolean aireExecution, Boolean localiteMereGrosesse, String prenomMereGrosesse) {
        super(write_uid, write_date, create_date, create_uid, __last_update);
        this.femmeEnceinteSort = femmeEnceinteSort;
        this.dteNaisMereGrosesse = dteNaisMereGrosesse;
        this.districtGrossesse = districtGrossesse;
        this.regionExecution = regionExecution;
        this.telMereGrosesse = telMereGrosesse;
        this.positionMereGrosesse = positionMereGrosesse;
        this.registreGrosesse = registreGrosesse;
        this.districtExecution = districtExecution;
        this.registreNumMereGrosesse = registreNumMereGrosesse;
        this.motifInterruptionGrosesse = motifInterruptionGrosesse;
        this.regionGrosesse = regionGrosesse;
        this.femmeEnceinte2 = femmeEnceinte2;
        this.termePrevu = termePrevu;
        this.state = state;
        this.checkMvaccinMereGrosesse = checkMvaccinMereGrosesse;
        this.dteCreationGrossesse = dteCreationGrossesse;
        this.femmeEnceinte = femmeEnceinte;
        this.aireGrossese = aireGrossese;
        this.nbreSemaine = nbreSemaine;
        this.aireExecution = aireExecution;
        this.localiteMereGrosesse = localiteMereGrosesse;
        this.prenomMereGrosesse = prenomMereGrosesse;
    }

    public Boolean getFemmeEnceinteSort() {
        return femmeEnceinteSort;
    }

    public void setFemmeEnceinteSort(Boolean femmeEnceinteSort) {
        this.femmeEnceinteSort = femmeEnceinteSort;
    }

    public String getDteNaisMereGrosesse() {
        return dteNaisMereGrosesse;
    }

    public void setDteNaisMereGrosesse(String dteNaisMereGrosesse) {
        this.dteNaisMereGrosesse = dteNaisMereGrosesse;
    }

    public DistrictLocalite getDistrictGrossesse() {
        return districtGrossesse;
    }

    public void setDistrictGrossesse(DistrictLocalite districtGrossesse) {
        this.districtGrossesse = districtGrossesse;
    }

    public Boolean getRegionExecution() {
        return regionExecution;
    }

    public void setRegionExecution(Boolean regionExecution) {
        this.regionExecution = regionExecution;
    }

    public String getTelMereGrosesse() {
        return telMereGrosesse;
    }

    public void setTelMereGrosesse(String telMereGrosesse) {
        this.telMereGrosesse = telMereGrosesse;
    }

    public String getPositionMereGrosesse() {
        return positionMereGrosesse;
    }

    public void setPositionMereGrosesse(String positionMereGrosesse) {
        this.positionMereGrosesse = positionMereGrosesse;
    }

    public String getRegistreGrosesse() {
        return registreGrosesse;
    }

    public void setRegistreGrosesse(String registreGrosesse) {
        this.registreGrosesse = registreGrosesse;
    }

    public Boolean getDistrictExecution() {
        return districtExecution;
    }

    public void setDistrictExecution(Boolean districtExecution) {
        this.districtExecution = districtExecution;
    }

    public Boolean getRegistreNumMereGrosesse() {
        return registreNumMereGrosesse;
    }

    public void setRegistreNumMereGrosesse(Boolean registreNumMereGrosesse) {
        this.registreNumMereGrosesse = registreNumMereGrosesse;
    }

    public Boolean getMotifInterruptionGrosesse() {
        return motifInterruptionGrosesse;
    }

    public void setMotifInterruptionGrosesse(Boolean motifInterruptionGrosesse) {
        this.motifInterruptionGrosesse = motifInterruptionGrosesse;
    }

    public RegionLocalite getRegionGrosesse() {
        return regionGrosesse;
    }

    public void setRegionGrosesse(RegionLocalite regionGrosesse) {
        this.regionGrosesse = regionGrosesse;
    }

    public Femme getFemmeEnceinte2() {
        return femmeEnceinte2;
    }

    public void setFemmeEnceinte2(Femme femmeEnceinte2) {
        this.femmeEnceinte2 = femmeEnceinte2;
    }

    public Boolean getTermePrevu() {
        return termePrevu;
    }

    public void setTermePrevu(Boolean termePrevu) {
        this.termePrevu = termePrevu;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getCheckMvaccinMereGrosesse() {
        return checkMvaccinMereGrosesse;
    }

    public void setCheckMvaccinMereGrosesse(Boolean checkMvaccinMereGrosesse) {
        this.checkMvaccinMereGrosesse = checkMvaccinMereGrosesse;
    }

    public String getDteCreationGrossesse() {
        return dteCreationGrossesse;
    }

    public void setDteCreationGrossesse(String dteCreationGrossesse) {
        this.dteCreationGrossesse = dteCreationGrossesse;
    }

    public Femme getFemmeEnceinte() {
        return femmeEnceinte;
    }

    public void setFemmeEnceinte(Femme femmeEnceinte) {
        this.femmeEnceinte = femmeEnceinte;
    }

    public AireLocalite getAireGrossese() {
        return aireGrossese;
    }

    public void setAireGrossese(AireLocalite aireGrossese) {
        this.aireGrossese = aireGrossese;
    }

    public Integer getNbreSemaine() {
        return nbreSemaine;
    }

    public void setNbreSemaine(Integer nbreSemaine) {
        this.nbreSemaine = nbreSemaine;
    }

    public Boolean getAireExecution() {
        return aireExecution;
    }

    public void setAireExecution(Boolean aireExecution) {
        this.aireExecution = aireExecution;
    }

    public Boolean getLocaliteMereGrosesse() {
        return localiteMereGrosesse;
    }

    public void setLocaliteMereGrosesse(Boolean localiteMereGrosesse) {
        this.localiteMereGrosesse = localiteMereGrosesse;
    }

    public String getPrenomMereGrosesse() {
        return prenomMereGrosesse;
    }

    public void setPrenomMereGrosesse(String prenomMereGrosesse) {
        this.prenomMereGrosesse = prenomMereGrosesse;
    }
}
