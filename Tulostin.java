
public class Tulostin {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
        // Kirjoita tulostuskoodi tänne
        int indeksi = 0;
        while (indeksi < taulukko.length) {
            int apu = 0;
            while (apu < taulukko[indeksi]) {
                System.out.print("*");
                apu++;
            } 
            System.out.println("");
            indeksi++;
        }
    }

}
