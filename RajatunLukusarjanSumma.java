
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int summa = 0;
        // int x = 0;
        
        System.out.print("Ensimmäinen: ");
        int ensimmainen = Integer.valueOf(lukija.nextLine());
        System.out.print("Viimeinen: ");
        int viimeinen = Integer.valueOf(lukija.nextLine());
        
        while (ensimmainen <= viimeinen) {
            summa += ensimmainen;
            ensimmainen++;
        }
        System.out.println("Summa on " + summa);
    }
}
