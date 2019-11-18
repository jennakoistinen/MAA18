
public class Tulostelua {

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(5);
        tulostaTahtia(3);
        tulostaTahtia(9);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        // tehtävän ensimmäinen osa
        int apu1 = 1;
        while (apu1 <= maara) {
            System.out.print("*");
            apu1++;
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        // tehtävän toinen osa
        int apu2 = 1;
        while (apu2 <= sivunpituus) {
            tulostaTahtia(sivunpituus); 
            apu2++;
        }
        System.out.println("");
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        // tehtävän kolmas osa
        int apu3 = 1;
        while (apu3 <= korkeus) {
            tulostaTahtia(leveys);
            apu3++;
        }
        System.out.println("");
    }

    public static void tulostaKolmio(int koko) {
        // tehtävän neljäs osa
        int apu4 = 1;
        while (apu4 <= koko) {
            tulostaTahtia(apu4);
            apu4++;
        }
        System.out.println("");
    }
}
