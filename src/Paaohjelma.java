
import java.util.Scanner;

public class Paaohjelma {
    public static void main(String[] args) {
        Maksukortti kortti = new Maksukortti(5);
        System.out.println(kortti);

        kortti.syoMaukkaasti();
        System.out.println(kortti);

        kortti.syoMaukkaasti();
        System.out.println(kortti);
    }
}
