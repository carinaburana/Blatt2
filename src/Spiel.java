public class Spiel {
    int hoelzerImSpiel;
    int startAnzahl;

    public Spiel(int startAnzahl) {
        this.startAnzahl = startAnzahl;
        hoelzerImSpiel = startAnzahl;

        while (hoelzerImSpiel > 0) {
            computerZiehen();
            if (hoelzerImSpiel <= 0) {
                Ausgabe.menschGewinnt();
                break;
            }
            menschZiehen();
            if (hoelzerImSpiel <= 0) {
                Ausgabe.computerGewinnt();
                break;
            }

        }
    }

    public void computerZiehen() {
        int zug;
        do {
            zug = berechneComputerZug();
            if (zug > hoelzerImSpiel) {
                Ausgabe.zugNichtMoeglich();
            }
        } while (hoelzerImSpiel - zug < 0);
        hoelzerImSpiel -= zug;
        Ausgabe.computerZug(hoelzerImSpiel, zug);
    }

    public void menschZiehen() {
        int zug;
        do {
            zug = Eingabe.leseHoelzer();
            if (zug > hoelzerImSpiel) {
                Ausgabe.zugNichtMoeglich();
            }
        } while (zug > hoelzerImSpiel);

        hoelzerImSpiel -= zug;
        Ausgabe.menschZug(hoelzerImSpiel, zug);
    }

    private int berechneComputerZug() {
        int zug = hoelzerImSpiel % 4;
        if (zug == 0) {
            zug = 1;
        }
        return zug;
    }

}