
import java.util.Scanner;

public class JokaToinenSana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String merkkijono = lukija.nextLine();
            if (merkkijono.equals("")) {
                break;
            }
            
            String[] palat = merkkijono.split("\\s+");
            for (int indeksi = 1; indeksi < palat.length;) {
                System.out.println(palat[indeksi]);
                indeksi = indeksi + 2;
            }                                
        }
    }
}
