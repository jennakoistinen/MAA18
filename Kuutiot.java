
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String mjono = lukija.nextLine();
            
            if (mjono.equals("loppu")) {
                break;
            }
            else {
                int luku = Integer.valueOf(mjono);
                System.out.println(luku * luku * luku);
            }
        }
    }
}
