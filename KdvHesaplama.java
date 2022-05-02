import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {

        double tutar,kdvOran,kdvTutar,kdvliTopTutar;
        Scanner inp = new Scanner(System.in);

        System.out.print("Para degerini giriniz :");
        tutar = inp.nextDouble();

        if(tutar<=1000 && tutar>0) {

            kdvOran=0.18;
            kdvTutar=tutar*kdvOran;
            kdvliTopTutar=+tutar+kdvTutar;
            System.out.println("Girilen Tutar :"+tutar);
            System.out.println("Kdv Orani :"+kdvOran);
            System.out.println("Kdv tutari :"+kdvTutar);
            System.out.println("Kdv dahil toplam tutar :"+kdvliTopTutar);

        }

        else if (tutar>1000) {

            kdvOran=0.08;
            kdvTutar=tutar*kdvOran;
            kdvliTopTutar=+tutar+kdvTutar;
            System.out.println("Girilen Tutar :"+tutar);
            System.out.println("Kdv Orani :"+kdvOran);
            System.out.println("Kdv tutari :"+kdvTutar);
            System.out.println("Kdv dahil toplam tutar :"+kdvliTopTutar);

        }

        else {
            System.out.println("Lütfen geçerli bir deger giriniz.");
        }



    }
}
