// tuodaan Scanner-apuvälin
import java.util.Scanner;

public class Itseisarvo {

    public static void main(String[] args) {
        // luodaan Scanner-apuväline
        Scanner lukija = new Scanner(System.in);

        // luodaan muuttuja
        int luku = Integer.valueOf(lukija.nextLine());
        
        // luodaan ehtolauseet ja tulostukset
        if (luku < 0) {
            System.out.println(luku*-1);
        } else {
            System.out.println(luku);
        }
    }
}
