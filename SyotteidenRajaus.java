
import java.util.Scanner;

public class SyotteidenRajaus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // ohjelma alkaa
    while (true) {
        System.out.println("Syötä luku");
        int luku = Integer.valueOf(lukija.nextLine());
        if (luku < 0) {
            System.out.println("Epäkelpo luku");
        } 
        if (luku == 0) {
            break;
        }
        if (luku > 0) {
         System.out.println(luku*luku);
        }
    }
    }
}
