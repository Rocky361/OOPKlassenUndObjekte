package de.bfw.oopklassenundobjekte;

public class Radio {
    private boolean istAn;
    private int lautstaerke;
    private double frequenz;


    Radio(boolean istAn, int lautstaerke, double frequenz){
        this.istAn = istAn;
        this.lautstaerke = lautstaerke;
        this.frequenz = frequenz;
    }

    public String toString(){
        String anAus = "aus";
        if(isIstAn()){
            anAus = "an";
        }
        System.out.println("Radio ist " + anAus + ", Frequenz: " + getFrequenz() + ", Lautstärke: " + getLautstaerke());
        return null;
    }

    void waehleSender(double frequenz){
        this.frequenz = frequenz;
        if (frequenz < 85 || frequenz > 110){
            System.out.println("Ausgewählte Frequenz ist außerhalb des Frequenzbereichs!");
            this.frequenz = 99.9;
        }
    }

    void lauter(){
        if(this.istAn){
            setLautstaerke(this.lautstaerke + 1);
        }else{
            System.out.println("Das Radio ist nicht angeschaltet!");
        }

    }

    void leiser(){
        if(this.istAn){
            setLautstaerke(this.lautstaerke - 1);
        }else{
            System.out.println("Das Radio ist nicht angeschaltet!");
        }
    }

    void an(){
        setIstAn(true);
    }

    void aus(){
        setIstAn(false);
    }



    public boolean isIstAn() {
        return istAn;
    }

    public void setIstAn(boolean istAn) {
        this.istAn = istAn;
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        if(this.istAn) {
            this.lautstaerke = lautstaerke;
            if (lautstaerke < 0 || lautstaerke > 10) {
                System.out.println("Die Lautstärker kann nur im Bereich von 0-10 eingestellt werden!");
                this.lautstaerke = 0;
            }
        }else{
            System.out.println("Das Radio ist nicht angeschaltet!");
            this.lautstaerke = 0;
        }
    }

    public double getFrequenz() {
        return frequenz;
    }

    public void setFrequenz(double frequenz) {
        this.frequenz = frequenz;
    }


}
