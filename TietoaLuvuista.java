// tuodaan Scanner-apuväline
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        // luodaan Scanner-apuväline
        Scanner lukija = new Scanner(System.in);
        
        // luodaan muuttujat
        int ensimmainen = Integer.valueOf(lukija.nextLine());
        int toinen = Integer.valueOf(lukija.nextLine());
        
        // luodaan ehdot ja tulostukset
        if (ensimmainen > toinen) {
            System.out.println("Luku " + ensimmainen + " on suurempi kuin luku " + toinen);
        } else if (ensimmainen < toinen) {
            System.out.println("Luku " + ensimmainen + " on pienempi kuin luku " + toinen);
        } else {
            System.out.println("Luku " + ensimmainen + " on yhtä suuri kuin luku " + toinen);
        }
    }
}
