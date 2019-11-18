
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        // tehtävän osa 1
        int moneskoTahti = 1;
        while (moneskoTahti <= maara) {
            System.out.print("*");
            moneskoTahti++;
        }
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
        // tehtävän osa 1
        int moneskoTyhja = 1;
        while (moneskoTyhja <= maara) {
            System.out.print(" ");
            moneskoTyhja++;
        }
    }

    public static void tulostaKolmio(int koko) {
        // tehtävän osa 2
        int rivi = 1;
        while (rivi <= koko) {
            tulostaTyhjaa(koko-rivi);
            tulostaTahtia(rivi);
            rivi++;
        }
    }

    public static void jouluKuusi(int korkeus) {
        // tehtävän osa 3
        int rivi = 1;
        int tahtia = 0; 
        while (rivi <= korkeus) {
            tahtia = 2 * rivi - 1;
            tulostaTyhjaa(korkeus - rivi);
            tulostaTahtia(tahtia);
            rivi++;
        }
        tulostaTyhjaa((tahtia - 3) / 2);
        tulostaTahtia(3);
        tulostaTyhjaa((tahtia - 3) / 2);
        tulostaTahtia(3);
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
