
import java.util.Scanner;

public class Alkuosa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Anna sana: ");
        String sana = lukija.nextLine();
        
        System.out.print("Alkuosan pituus: ");
        int pituus = Integer.valueOf(lukija.nextLine());
        
        String alkuosa = sana.substring(0, pituus);
        
        System.out.println("Tulos: " + alkuosa);
    }
}
