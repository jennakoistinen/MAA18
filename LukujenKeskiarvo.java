
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //Ohjelma alkaa
        double keskiarvo =0;
        double lukumaara = 0;
        double summa = 0;
    while (true) {
        System.out.println("Syötä luku");
        int luku = Integer.valueOf(lukija.nextLine());
        if (luku == 0){
            break;
        }
        else {
            lukumaara = lukumaara + 1;
            summa = summa + luku;
            keskiarvo = summa/lukumaara;
        }
    }
    System.out.println("Lukujen keskiarvo " + keskiarvo);
    }
}
