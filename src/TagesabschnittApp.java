public class TagesabschnittApp {

    /**
     * Aufgabe: Schreibe den Tagesabschnitt aufgrund der Stunde auf die Konsole
     * 6-9 -> Früh
     * 9-12 -> Vormittag
     * 12-16 -> Nachmittag
     * 16-20 -> Abend
     * 20-6 -> Nacht
     * <p>
     * Zusatz: Sollte die Stunde kleiner als 0 oder größer als 23 sein,
     * dann soll "Falsche Stunde" auf die Konsole geschrieben werden
     */
    public static void main(String[] args) {

        // stunde deklarieren und initialisieren

        // Kontroll Flow (if - else if - else)
        int stunde = 28;
        printTagesabschnitt1(stunde);
        printTagesabschnitt2(stunde);
        printTagesabschnitt3(stunde);
        printTagesabschnitt4(stunde);

    }

    public static void printTagesabschnitt1(int stunde) {
        // Logik ohne Zusatz:
        // if (zwischen 6 inkl und 9 inkl) -> Früh
        if (stunde >= 6 && stunde <= 9) {
            System.out.println("Früh");
        }
        // if (zwischen 9 exkl und 12 inkl) -> Vormittag
        else if (stunde > 9 && stunde <= 12) {
            System.out.println("Vormittag");
        }
        // if (zwischen 12 exkl und 16 inkl) -> Nachmittag
        else if (stunde > 12 && stunde <= 16) {
            System.out.println("Nachmittag");
        }
        // if (zwischen 16 exkl und 20 inkl) -> Abend
        else if (stunde > 16 && stunde <= 20) {
            System.out.println("Abend");
        }
        // sonst Nacht
        else {
            System.out.println("Nacht");
        }
    }


    public static void printTagesabschnitt2(int stunde) {
        // Logik ohne Zusatz:
        // if (stunde < 6) -> Nacht
        if (stunde < 6) {
            System.out.println("Nacht");
        }
        // if (stunde <= 9) -> Früh
        else if (stunde <= 9) {
            System.out.println("Früh");
        }
        // if (stunde <= 12) -> Vormittag
        else if (stunde <= 12) {
            System.out.println("Vormittag");
        }
        // if (stunde <= 16) -> Nachmittag
        else if (stunde <= 16) {
            System.out.println("Nachmittag");
        }
        // if (stunde <= 20) -> Abend
        else if (stunde <= 20) {
            System.out.println("Abend");
        }
        // sonst -> Nacht
        else {
            System.out.println("Nacht");
        }
    }

    public static void printTagesabschnitt3(int stunde) {
        // Logik mit Zusatz:

        if (stunde < 0 || stunde > 23) {
            System.out.println("Falsche Uhrzeit");
        }
        // if (zwischen 6 inkl und 9 inkl) -> Früh
        else if (stunde >= 6 && stunde <= 9) {
            System.out.println("Früh");
        }
        // if (zwischen 9 exkl und 12 inkl) -> Vormittag
        else if (stunde > 9 && stunde <= 12) {
            System.out.println("Vormittag");
        }
        // if (zwischen 12 exkl und 16 inkl) -> Nachmittag
        else if (stunde > 12 && stunde <= 16) {
            System.out.println("Nachmittag");
        }
        // if (zwischen 16 exkl und 20 inkl) -> Abend
        else if (stunde > 16 && stunde <= 20) {
            System.out.println("Abend");
        }
        // sonst Nacht
        else {
            System.out.println("Nacht");
        }
    }

    public static void printTagesabschnitt4(int stunde) {
        // Logik mit Zusatz:

        if (stunde < 0 || stunde > 23) {
            System.out.println("Falsche Uhrzeit");
            return;
        }

        // if (zwischen 6 inkl und 9 inkl) -> Früh
        if (stunde >= 6 && stunde <= 9) {
            System.out.println("Früh");
        }
        // if (zwischen 9 exkl und 12 inkl) -> Vormittag
        else if (stunde > 9 && stunde <= 12) {
            System.out.println("Vormittag");
        }
        // if (zwischen 12 exkl und 16 inkl) -> Nachmittag
        else if (stunde > 12 && stunde <= 16) {
            System.out.println("Nachmittag");
        }
        // if (zwischen 16 exkl und 20 inkl) -> Abend
        else if (stunde > 16 && stunde <= 20) {
            System.out.println("Abend");
        }
        // sonst Nacht
        else {
            System.out.println("Nacht");
        }
    }
}
