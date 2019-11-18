
import java.io.File;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();

        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {
            boolean loytyyko = false;
            while (tiedostonLukija.hasNextLine()) {
                if (tiedostonLukija.nextLine().equals(etsittava)) {
                    loytyyko = true;
                    break;
                } 
            }
            if (loytyyko == true) {
                System.out.println("Löytyi!");
            } else {
                System.out.println("Ei löytynyt.");
            }
        } catch (Exception e) {
            System.out.println("tiedoston lukeminen epäonnistui. " + e.getMessage());
        }
    }
}
