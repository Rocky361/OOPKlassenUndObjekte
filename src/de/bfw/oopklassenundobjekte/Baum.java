package de.bfw.oopklassenundobjekte;

public class Baum {
    private int baumAlter;
    private double baumstammRadiusCm, baumHoeheCm;
    private String farbeRinde, baumArt, herkunft, standort;
    private boolean befallen;

    // Custom Konstruktor
    // 1. Muss nach aussen aufrufbar sein
    // 2. Hat keinen Datentyp
    // 3. Heisst genauso wie die Klasse

    public Baum(int baumalter, double baumstammRadiusCm, double baumHoeheCm, String farbeRinde, String herkunft, String baumArt, String standort, boolean befallen ) {
        this.baumAlter = baumalter;
        this.baumstammRadiusCm = baumstammRadiusCm;
        this.baumHoeheCm = baumHoeheCm;
        this.farbeRinde = farbeRinde;
        this.herkunft = herkunft;
        this.baumArt = baumArt;
        this.standort = standort;
        this.befallen = befallen;
    }

    // Defaultkonstruktor
    // leerer Konstruktor
    public Baum(){

    }

    // Setter braucht immer Übergabeparameter, von außen sichtbar, void
    public void setBaumAlter(int baumAlter){
        this.baumAlter = baumAlter;
    }
    // Getter nauch außenhin aufrufbar, niemals void, kein übergabeparameter
    public int getBaumAlter() {
        return this.baumAlter;
    }
    public void setBaumstammRadiusCm(double baumstammRadiusCm1){
        baumstammRadiusCm = baumstammRadiusCm1;
    }
    public double getBaumstammRadiusCm() {
        return baumstammRadiusCm;
    }
    public void setBaumHoeheCm(double baumHoeheCm){
        this.baumHoeheCm = baumHoeheCm;
    }
    public double getBaumHoeheCm() {
        return this.baumHoeheCm;
    }
    public void setFarbeRinde(String farbeRinde){
        this.farbeRinde = farbeRinde;
    }
    public String getFarbeRinde(){
        return this.farbeRinde;
    }
    public void setBaumArt(String baumArt){
        this.baumArt = baumArt;
    }
    public String getBaumArt(){
        return this.baumArt;
    }
    public void setHerkunft(String herkunft){
        this.herkunft = herkunft;
    }
    public String getHerkunft(){
        return this.herkunft;
    }
    public void setStandort(String standort){
        this.standort = standort;
    }
    public String getStandort(){
        return this.standort;
    }
    public void setBefallen(boolean befallen){
        this.befallen = befallen;
    }
    public boolean isBefallen(){
        return this.befallen;
    }
}
