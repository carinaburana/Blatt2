import java.util.Scanner;

public class Eingabe {

    public static int leseZahl() {
        boolean validNumber = false;
        int nummer = 0;
        
        while(!validNumber){
        Ausgabe.zahlEingeben();
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.nextLine();

        try {
            nummer = Integer.parseInt(eingabe);
            validNumber = true;
        } catch (NumberFormatException e) {
            Ausgabe.keineZahl();
        }
    }
        return nummer;
}

public static int leseHoelzer(){
    boolean validScope = false;
    int zug = 0;
    while(!validScope){
        zug = leseZahl();
        if (zug < 1 || zug > 3){
            Ausgabe.zahlNichtImBereich();
        } else {
            validScope = true;
        }
    }
    return zug;
   
}
}
