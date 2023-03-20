package de.bfw.oopklassenundobjekte;

public class Patient {
    String name, adresse;
    int patientNr, gewicht, groesse;

    public Patient(String name, String adresse, int patientNr, int gewicht, int groesse) {
        this.name = name;
        this.adresse = adresse;
        this.patientNr = patientNr;
        this.gewicht = gewicht;
        this.groesse = groesse;
    }

    public Patient(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getPatientNr() {
        return patientNr;
    }

    public void setPatientNr(int patientNr) {
        this.patientNr = patientNr;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }
}
