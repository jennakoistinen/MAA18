
import java.util.ArrayList;
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> merkkijonot = new ArrayList<>();
        
        while (true) {
            String mjono = lukija.nextLine();
            merkkijonot.add(mjono);
            
            if (mjono.equals("loppu")) {
                break;
            }
        }
        System.out.println(merkkijonot.size() - 1);
    }
}
