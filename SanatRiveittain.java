
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String merkkijono = lukija.nextLine();
            String[] palat = merkkijono.split("\\s+");
            
            for (String tulostus: palat) {
                System.out.println(tulostus);   
            }
            
            if (merkkijono.equals("")) {
                break;
            }
        }
    }
}
