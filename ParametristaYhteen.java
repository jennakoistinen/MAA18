
import java.util.Scanner;

public class ParametristaYhteen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        tulostaLuvustaYhteen(5);
    }
    public static void tulostaLuvustaYhteen(int luku) {
        int x = 1;
        while (x <= luku) {
            System.out.println(luku);
            luku--;
        }             
    }
}
