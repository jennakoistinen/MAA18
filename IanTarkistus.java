// tuodaan Scanner-apuväline
import java.util.Scanner;

public class IanTarkistus {

    public static void main(String[] args) {
        // luodaan Scanner-apuväline
        Scanner lukija = new Scanner(System.in);

        System.out.print("Kuinka vanha olet? ");
        int ika = Integer.valueOf(lukija.nextLine());
        if (ika >= 0 && ika <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Mahdotonta!");
        }
    }
}
