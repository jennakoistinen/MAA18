
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // Kirjoita ohjelma tähän
            System.out.println("Anna ensimmäinen luku:");
            int luku = Integer.valueOf(lukija.nextLine());
            System.out.println("Anna toinen luku:");
            int luku2 = Integer.valueOf(lukija.nextLine());
    if (luku > luku2) {
            System.out.println("Suurempi luku: " + luku);
    } else if (luku2 > luku) {
        System.out.println("Suurempi luku: " + luku2);
    } else if (luku == luku2) {
        System.out.println("Luvut ovat yhtä suuret!");
    }
    }
}
