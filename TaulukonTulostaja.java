
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        // Kirjoita koodia tänne
        int indeksi = 0;
        String tulostus = "";
        while (indeksi < taulukko.length) {
            if (indeksi == taulukko.length - 1) {
                tulostus += taulukko[indeksi];
                break;
            }
            tulostus += taulukko[indeksi] + ", ";
            indeksi++;
        }
        System.out.print(tulostus);
    }
}
