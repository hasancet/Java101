import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n,r ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz :");
        n = inp.nextInt();

        System.out.print("Ikinci sayiyi giriniz :");
        r = inp.nextInt();

        int fact=1, rfact=1, farkfact=1;

        for (int i=1; i<=n; i++) {
            fact*=i;
            if (i<=r)
                rfact*=i;
            if (i <= (n-r))
                farkfact*=i;
        }

        double kombinasyon = ((double) fact/(rfact*farkfact));

        System.out.println("Kombinasyon:"+kombinasyon);



    }
}
