
import java.util.Scanner;

public class NimenPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // kutsu täältä metodiasi
        System.out.print("Anna nimi: ");
        String merkkijono = lukija.nextLine();
        
        System.out.print("Kirjainmäärä: " + laskeKirjaimet(merkkijono));
    }
    
    // tee tänne metodi 
    public static int laskeKirjaimet(String merkkijono) {
        merkkijono.length();
        return merkkijono.length();
    }
    
}
