// tuodaan Scanner-apuväline
import java.util.Scanner;

public class LukujenSumma {

    public static void main(String[] args) {
        // luodaan Scanner-apuväline
        Scanner lukija = new Scanner(System.in);

        // luodaan muuttuja
        int summa = 0;
        
        // luodaan toistolause
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0){
            System.out.println(summa);
            break;
            } else {
                summa = summa + luku;
            }
        }
    }
}
