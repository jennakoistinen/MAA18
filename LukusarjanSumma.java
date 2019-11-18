// tuodan Scanner-apuväline
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        // luodaan Scanner-apuväline
        Scanner lukija = new Scanner(System.in);

        int summa = 0;
        int x = 0;
        
        System.out.print("Mihin asti? ");
        int mihinAsti = Integer.valueOf(lukija.nextLine());
        
        while (x <= mihinAsti) {
            summa += x;
            x ++;
        }
        System.out.println("Summa on " + summa);
    }
}
