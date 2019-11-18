// tuodaan Scanner-apuväline
import java.util.Scanner;

public class YkkostenOsuus {

    public static void main(String[] args) {
        // luodaan Scanner-apuväline
        Scanner lukija = new Scanner(System.in);

        // luodaan muuttujat
        double ykkostenOsuus = 0;
        int ykkostenLukumaara = 0;
        int lukujenLukumaara = 0;
        
        // luodaan toistolause
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                if (ykkostenOsuus == 0) {
                    System.out.println("ykkösten osuutta ei voida laskea");
                } else {
                    System.out.println(ykkostenOsuus);
                }
                break;
            } else {
                if (luku == 1) {
                    ykkostenLukumaara = ykkostenLukumaara + 1;
                }
                lukujenLukumaara = lukujenLukumaara + 1;
                ykkostenOsuus = 1.0 * ykkostenLukumaara / lukujenLukumaara;

            }
        }
    }
}
