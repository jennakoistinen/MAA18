
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // KIRJOITA OHJELMASI TÄNNE
        System.out.print("Mihin asti? ");
        int mihinAsti = Integer.valueOf(lukija.nextLine());
        
        System.out.print("Mistä lähtien? ");
        int mistaLahtien = Integer.valueOf(lukija.nextLine());
        
        while (mistaLahtien <= mihinAsti) {
            System.out.println(mistaLahtien);
            mistaLahtien++;
        }
    }
}
