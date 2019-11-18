// tuodaan Scanner-apuväline
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        // luodaan Scanner-apuväline
        Scanner lukija = new Scanner(System.in);

        // luodaan muuttujat
        double positiivistenLukujenKeskiarvo = 0;
        int positiivistenLukujenLukumaara = 0;
        int positiivistenLukujenSumma = 0; 
        
        // luodaan toistolause
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                if (positiivistenLukujenLukumaara == 0) {
                    System.out.println("keskiarvon laskeminen ei ole mahdollista");
                } else {
                    System.out.println(positiivistenLukujenKeskiarvo);
                }
                break;
            } else if (luku > 0) {
                positiivistenLukujenSumma = positiivistenLukujenSumma + luku;
                positiivistenLukujenLukumaara = positiivistenLukujenLukumaara + 1;
                positiivistenLukujenKeskiarvo = 1.0 * positiivistenLukujenSumma / positiivistenLukujenLukumaara;  
            }
        }
    }
}
