
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int kertoma = 1;
        int x = 1;
        
        System.out.print("Anna luku: ");
        int luku = Integer.valueOf(lukija.nextLine());
        
        while (x <= luku) {
            kertoma *= x;
            x++;
        }
        System.out.println("Kertoma on " + kertoma);
    }
}
