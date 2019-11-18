
import java.util.Scanner;

public class KolmellaJaolliset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        kolmellaJaollisetValilta(3, 6);

    }
    public static void kolmellaJaollisetValilta(int alku, int loppu) {
        int x = alku - 1;
        
        while (x <= loppu) {
            x++;
            if (x % 3 == 0) {
                System.out.println(x);
            }
        }
    }
}
