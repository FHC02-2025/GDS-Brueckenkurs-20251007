public class ZinsDemo {

    public static void main(String[] args) {

        // 2 variablen -> kontostand und zinsen
        double kontostand = 1000.0;
        double zinsen = 2.25;

        // Berechnung des Wertes
        double result = berechneZinsen(kontostand, zinsen);

        // Ausgabe
        System.out.println("result = " + result);

        // Berechne den Fixzins
        System.out.println("Fixzins: " + berechneFixZins(kontostand));

        System.out.println(berechneZinsen(3333.33, 4.2));
        System.out.println(berechneZinsen(250.50, 3.6));

        printZinsen(result);

        double newResult = berechneZinsen(4004.0, 2.3);
        printZinsen(newResult);
    }

    public static double berechneFixZins(double kontostand) {
        double fixZins = 2.25;
        return kontostand * fixZins / 100;
    }

    public static double berechneZinsen(double kontostand, double zinsen) {
        return kontostand * zinsen / 100;
    }

    public static void printZinsen(double result) {
        System.out.println(result);
    }
}
