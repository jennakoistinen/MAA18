// tuodaan Scanner-apuväline
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        // luodaan Scanner-apuväline
        Scanner lukija = new Scanner(System.in);

        int luettuLuku = Integer.valueOf(lukija.nextLine());
        
        while (luettuLuku <= 100) {
            System.out.println(luettuLuku);
            luettuLuku++;
        }
    }
}
