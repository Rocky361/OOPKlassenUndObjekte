package de.bfw.oopklassenundobjekte;
public class OOPKlassenUndObjekte {
    public static void main(String[] args) {
        // Erstellen Sie eine Klasse baum und finden Sie 5 Eigenschaften

        // Objekt Baum bauen
        // Datentyp Objektname = new Konstruktor();
       /* Baum baum1 = new Baum();
        Baum baum2 = new Baum(3, 4, 5, "1", "2", "3", "4", true);


        // Eingabe
        baum1.setBaumAlter(333);
        baum1.setHerkunft("Berlin");
        baum1.setBaumArt("Linde");
        baum1.setBaumHoeheCm(180.23);
        baum1.setBefallen(false);
        baum1.setBaumstammRadiusCm(55.5);
        baum1.setFarbeRinde("Braun");

        // Ausgabe
        if(baum1.isBefallen()){
            System.out.println("befallen");
        }else{
            System.out.println("nicht befallen");
        }
        System.out.println(baum1.getBaumAlter());
        System.out.println(baum1.getHerkunft());
        System.out.println(baum1.getBaumArt());

        Patient p1 = new Patient("Peter", "Musterstraße 9", 123, 90, 180);
        System.out.println("Name: " + p1.getName() + "\nAdresse: " + p1.getAdresse() + "\nPatienten Nr.: " + p1.getPatientNr() + "\nGewicht: " + p1.getGewicht() + "\nKörpergröße: " + p1.getGroesse());
        Patient p2 = new Patient();*/


        Radio radio = new Radio(true, 0, 99.9);
        radio.an();
        radio.setLautstaerke(8);
        radio.leiser();
        radio.waehleSender(111);
        radio.toString();

    }
}