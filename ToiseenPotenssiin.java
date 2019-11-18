// tuodaan Scanner-apuväline
import java.util.Scanner;

public class ToiseenPotenssiin {

    public static void main(String[] args) {
        // luodaan Scanner-apuväline
        Scanner lukija = new Scanner(System.in);

        // määritetään muuttuja
        int luku = Integer.valueOf(lukija.nextLine());
        
        // muodostetaan laskuoperaatio ja lasketaan
        int tulos = luku * luku;
        System.out.println(tulos);
    }
}
