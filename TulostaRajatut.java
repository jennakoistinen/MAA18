
import java.util.ArrayList;

public class TulostaRajatut {

    public static void main(String[] args) {
        ArrayList<Integer> luvut = new ArrayList<>();
        
        luvut.add(3);
        luvut.add(2);
        luvut.add(6);
        luvut.add(-1);
        luvut.add(5);
        luvut.add(1);
        
        System.out.println("Luvut välillä [0, 5]");
        tulostaRajatutLuvut(luvut, 0, 5);
        
        System.out.println("Luvut välillä [3, 10]");
        tulostaRajatutLuvut(luvut, 3, 10);
    
    
        // kokeile toteuttamasi metodin toimintaa täällä
    }
    public static void tulostaRajatutLuvut(ArrayList<Integer> luvut, int alaraja, int ylaraja) {
        for (Integer  x: luvut) {
            if (x >= alaraja && x <= ylaraja) {
            System.out.println(x); 
            }
        }
        
    } 

}
