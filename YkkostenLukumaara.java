// tuodaan Scanner-apuväline
import java.util.Scanner;

public class YkkostenLukumaara {

    public static void main(String[] args) {
        // luodaan Scanner-apuväline
        Scanner lukija = new Scanner(System.in);

        // luodaan muuttuja
        int lukumaara = 0;
        
        // luodaan toistolause
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                System.out.println(lukumaara);
                break;
            } else if (luku == 1) {
                lukumaara = lukumaara + 1;
            }
        }
    }
}
