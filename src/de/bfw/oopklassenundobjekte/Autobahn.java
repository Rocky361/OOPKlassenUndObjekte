package de.bfw.oopklassenundobjekte;

public class Autobahn {
    private int richtGeschwindigkeit, spuren;
    private String name, ausfahrt;
    private boolean tempolimit;

    public Autobahn(int richtGeschwindigkeit, int spuren, String name, String ausfahrt, boolean tempolimit){
        this.richtGeschwindigkeit = richtGeschwindigkeit;
        this.spuren = spuren;
        this.name = name;
        this.ausfahrt = ausfahrt;
        this.tempolimit = tempolimit;
    }

    public Autobahn() {
    }

    public int getRichtGeschwindigkeit(){
        return richtGeschwindigkeit;
    }
    public void setRichtGeschwindigkeit(int richtGeschwindigkeit){
        this.richtGeschwindigkeit = richtGeschwindigkeit;
    }

    public int getSpuren() {
        return spuren;
    }

    public void setSpuren(int spuren) {
        this.spuren = spuren;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAusfahrt() {
        return ausfahrt;
    }

    public void setAusfahrt(String ausfahrt) {
        this.ausfahrt = ausfahrt;
    }

    public boolean isTempolimit() {
        return tempolimit;
    }

    public void setTempolimit(boolean tempolimit) {
        this.tempolimit = tempolimit;
    }
}
