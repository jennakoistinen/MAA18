
import java.util.Scanner;

public class TulostusKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän.
        System.out.print("Mitä tulostetaan? ");
        String tulostus = lukija.nextLine();
        System.out.println("");
        System.out.println(tulostus + tulostus + tulostus);
    }
}
