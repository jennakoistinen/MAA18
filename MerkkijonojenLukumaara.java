// tuodaan Scanner-apuväline
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        // luodaan Scanner-apuväline
        Scanner lukija = new Scanner(System.in);

        // määritetään muuttujat
        int lukumaara = 0;
        
        // luodaan toistolause
        while (true) {
            String merkkijono = lukija.nextLine();
            
            if (merkkijono.equals("loppu")) {
                System.out.println(lukumaara);
                break;
            } else {
                lukumaara = lukumaara + 1;
            }
        }
    }
}
