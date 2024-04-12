public class Ausgabe {

    public void zahlEingeben(){
        System.out.println("Bitte geben Sie eine Zahl ein: ");
    }

    public void keineZahl(){
        System.out.println("Das ist keine Zahl!");
    }

    public void zahlNichtImBereich(){
        System.out.println("Die Zahl ist nicht im gültigen Bereich zwischen 1 und 3!");
    }
    
    public void menschGewinnt(){
        System.out.println("Herzlichen Glückwunsch, Sie haben gewonnen!");
    }

    public void computerGewinnt(){
        System.out.println("Der Computer hat leider gewonnen!");
    }

    public void zugNichtMoeglich(){
        System.out.println("Es liegen weniger Hölzer auf dem Tisch als Sie ziehen wollen!");
    }

    public void spielstand(int anzahlStreichhoelzer){
        System.out.println("Es liegen " + anzahlStreichhoelzer + " Streichhölzer auf dem Tisch.");
    }

    public void menschZug(int anzahlStreichhoelzer, int anzahlSpielzug){
        System.out.println("Sie nehmen " + anzahlSpielzug + " Streichhölzer. Es liegen nun " + anzahlStreichhoelzer + " Streichhölzer auf dem Tisch.");
    }

    public void computerZug(int anzahlStreichhoelzer, int anzahlSpielzug){
        System.out.println("Der Computer zieht " + anzahlSpielzug + " Streichhölzer. Es liegen nun " + anzahlStreichhoelzer + " Streichhölzer auf dem Tisch.");
    }
}
