package de.bfw.oopklassenundobjekte;

public class Pizza {
    private double umfang;
    private int belaege;
    private String sorte, sosse;
    private boolean kaeserand;
    public Pizza(double umfang, int belaege, String sorte, String sosse, boolean kaeserand){
        this.umfang = umfang;
        this.belaege = belaege;
        this.sorte = sorte;
        this.sosse = sosse;
        this.kaeserand = kaeserand;
    }

    public Pizza() {
    }

    public double getUmfang() {
        return umfang;
    }
    public void setUmfang(double umfang){
        this.umfang = umfang;
    }
    public int getBelaege(){
        return belaege;
    }
    public void setBelaege(int belaege){
        this.belaege = belaege;
    }
    public String getSorte() {
        return sorte;
    }
    public void setSorte(String sorte) {
        this.sorte = sorte;
    }
    public String getSosse() {
        return sosse;
    }
    public void setSosse(String sosse) {
        this.sosse = sosse;
    }
    public boolean isKaeserand() {
        return kaeserand;
    }
    public void setKaeserand(boolean kaeserand) {
        this.kaeserand = kaeserand;
    }
}
