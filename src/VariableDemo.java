/**
 * Übungsbeispiel 1
 * Link: "https://moodle.campus02.at/pluginfile.php/296892/mod_resource/content/1/%C3%9Cbungsbeispiele_LV1.pdf"
 *
 */
public class VariableDemo {

    public static void main(String[] args) {
        // variable = ein gefäß / ein container für einen wert

        // 1. Deklarieren
        // 2. Initialisieren

        // a) nur deklarieren und später initalisieren
        String firstName;

        // b) beides auf einmal
        String lastName = "Mustermann";

        // a)2) initialisieren
        firstName = "Max";

        int age = 27;

        double price = 99.99;


        System.out.println("Der Name lautet: " + firstName + " " + lastName + " Alter " + age);
    }


}
