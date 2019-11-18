
import java.util.Scanner;

public class Poistutaanko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // ohjelma alkaa
    while (true) {
        System.out.println("Poistutaanko?");
        String syöte = lukija.nextLine();
        if (syöte.equals("kyllä")) {
            break;
        }
    } 
    }
}
