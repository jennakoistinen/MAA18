
import java.util.Scanner;

public class NegatiivistenLukujenMaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // ohjelma alkaa
    int lukuja = 0;
    while (true) {
        System.out.println("Syötä luku");
        int luku = Integer.valueOf(lukija.nextLine());
        if (luku == 0) {
            break;
        }
        if (luku < 0) {
            lukuja = lukuja + 1;
        }
        if (luku > 0) {
            continue;
        }
    }
        System.out.println("Negatiivisia lukuja yhteensä " + lukuja);
    }
}
