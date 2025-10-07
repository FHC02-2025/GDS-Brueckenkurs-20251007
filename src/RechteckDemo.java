@SuppressWarnings("LanguageDetectionInspection")
public class RechteckDemo {

    public static void main(String[] args) {
        // Umfang: (breite + laenge) * 2
        // Fläche: breite * laenge

        // Schritte:
        // zuerst 2 variablen deklarieren und initalisieren für breite und für länge
        // datentyp name = wert
        int breite = 3;
        int laenge = 4;

        // nächster schritt -> umfang berechnen und in eine variable speichern
        int umfang = (breite + laenge) * 2;

        // nächster schritt -> fläche berechnen und in eine variable speichern
        int flaeche = breite * laenge;

        // letzter Schritt -> die Berechnungen ausgeben
        // soutv
        System.out.println("umfang = " + umfang);
        System.out.println("flaeche = " + flaeche);

    }
}
