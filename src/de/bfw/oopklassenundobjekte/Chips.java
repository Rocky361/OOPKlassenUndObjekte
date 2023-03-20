package de.bfw.oopklassenundobjekte;

public class Chips {
    private String sorte;
    private boolean geriffelt;
    private int kalorien, gewicht;
    private double preis;

    public Chips(String sorte, boolean geriffelt, int kalorien, int gewicht, double preis) {
        this.sorte = sorte;
        this.geriffelt = geriffelt;
        this.kalorien = kalorien;
        this.gewicht = gewicht;
        this.preis = preis;
    }

    public Chips() {
    }

    public String getSorte(){
        return sorte;
    }
    public void setSorte(String sorte){
        this.sorte = sorte;
    }

    public boolean isGeriffelt() {
        return geriffelt;
    }
    public void setGeriffelt(boolean geriffelt){
        this.geriffelt = geriffelt;
    }
    public int getKalorien() {
        return kalorien;
    }
    public void setKalorien(int kalorien) {
        this.kalorien = kalorien;
    }
    public int getGewicht() {
        return gewicht;
    }
    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
    public double getPreis() {
        return preis;
    }
    public void setPreis(double preis) {
        this.preis = preis;
    }
}
