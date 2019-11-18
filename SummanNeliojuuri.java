// tuodaan Scanner-apuvälin
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        // luodaan Scanner-apuväline
        Scanner lukija = new Scanner(System.in);

        // luodaan muuttujat
        int eka = Integer.valueOf(lukija.nextLine());
        int toka = Integer.valueOf(lukija.nextLine());
        
        // laskuoperaatiot
        int summa = eka + toka;
        double neliojuuri = Math.sqrt(summa);
        
        // tulostetaan neliojuuri
        System.out.println(neliojuuri);
    }
}
