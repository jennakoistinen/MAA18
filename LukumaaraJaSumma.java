
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

    // ohjelma alkaa
    int lukumaara = 0;
    int summa = 0;
    while (true) {
        System.out.println("Syötä luku");
        int luku = Integer.valueOf(lukija.nextLine());
        
        if (luku == 0) {
            break;
        }
        else {
            lukumaara = lukumaara + 1;
            summa = summa + luku;
        }
    }
    System.out.println("Lukuja yhteensä " + lukumaara);
    System.out.println("Lukujen summa " + summa);
    }
}
