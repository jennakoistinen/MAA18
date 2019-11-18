// tuodaan Scanner-apuväline
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        // luodaan Scanner-apuväline
        Scanner lukija = new Scanner(System.in);

        int luku = 0;
        int luettuLuku = Integer.valueOf(lukija.nextLine());
        
        while (luku <= luettuLuku) {
            System.out.println(luku);
            luku++;
        }
    }
}
