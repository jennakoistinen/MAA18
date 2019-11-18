// tuodaan Scaner-apuväline
import java.util.Scanner;

public class HipHipHurraa {

    public static void main(String[] args) {
        // luodaan Scanner-apuväline
        Scanner lukija = new Scanner(System.in);

        // luodaan toistolause
        while (true) {
            String luettu = lukija.nextLine();
            
            // luodaan ehtolause ja tulostukset
            if (luettu.equals("lopeta")) {
                System.out.println("hurraa!");
                break;
            } else {
                System.out.println("hip!");
            }
        }
    }
}
