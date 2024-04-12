public class Ausgabe {

    public static void zahlEingeben(){
        System.out.println("Bitte geben Sie eine Zahl ein: ");
    }

    public static void keineZahl(){
        System.out.println("Das ist keine Zahl!");
    }

    public static void zahlNichtImBereich(){
        System.out.println("Die Zahl ist nicht im gültigen Bereich zwischen 1 und 3!");
    }
    
    public static void menschGewinnt(){
        System.out.println("Herzlichen Glückwunsch, Sie haben gewonnen!");
    }

    public static void computerGewinnt(){
        System.out.println("Der Computer hat leider gewonnen!");
    }

    public static void zugNichtMoeglich(){
        System.out.println("Es liegen weniger Hölzer auf dem Tisch als Sie ziehen wollen!");
    }

    public static void spielstand(int hoelzerImSpiel){
        System.out.println("Es liegen " + hoelzerImSpiel + " Streichhölzer auf dem Tisch.");
    }

    public static void menschZug(int hoelzerImSpiel, int zug){
        System.out.println("Sie nehmen " + zug + " Streichhölzer. Es liegen nun " + hoelzerImSpiel + " Streichhölzer auf dem Tisch.");
    }

    public static void computerZug(int hoelzerImSpiel, int zug){
        System.out.println("Der Computer zieht " + zug + " Streichhölzer. Es liegen nun " + hoelzerImSpiel + " Streichhölzer auf dem Tisch.");
    }
}
