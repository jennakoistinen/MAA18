
import java.util.Scanner;

public class YhdestaParametriin {

    public static void main(String[] args) {
       Scanner lukija = new Scanner(System.in);
        tulostaLukuunAsti(5); 
    }
       public static void tulostaLukuunAsti(int luku) {
           int x = 1;
           while (x <= luku) {
               System.out.println(x);
               x++;
           }
       }
}
