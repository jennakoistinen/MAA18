
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> nimet = new ArrayList<>();
        ArrayList<Integer> vuosi = new ArrayList<>();

        while (true) {
            String nimiJaVuosi = lukija.nextLine();
            
            if (nimiJaVuosi.equals("")) {
                break;
            }
            
            String[] palat = nimiJaVuosi.split(",");
            nimet.add(palat[0]);
            vuosi.add(Integer.parseInt(palat[1]));
        }
        String pisinNimi = "";
        double keskiarvo = 0;
        int summa = 0;
        for (int i = 0; i < nimet.size(); i++) {
            if (i == 0) {
               pisinNimi = nimet.get(i);
            } 
            else if (nimet.get(i).length() > pisinNimi.length()) {
                pisinNimi = nimet.get(i);
            }
            summa += vuosi.get(i);
        }
        System.out.println("Pisin nimi: " + pisinNimi);
        keskiarvo = 1.0 * summa / vuosi.size();
        System.out.println("Syntymävuosien keskiarvo: " + keskiarvo);
    }
}
