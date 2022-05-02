import java.util.Scanner;
public class VucutKıtleEndeks {
    public static void main(String[] args) {
        double boy,kilo,indeks;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz :");
        boy= inp.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz :");
        kilo= inp.nextDouble();

        indeks = kilo/(boy*boy);

        System.out.println("Vucut Kitle Indeksiniz :" +indeks);

    }
}
