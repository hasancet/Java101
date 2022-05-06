import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int tip, yas, km;

        double normalTutar, yasIndırımı, indirimliTutar, gidisDonusIndirimi, topTutar;

        System.out.print("KM Giriniz :");
        km = inp.nextInt();

        normalTutar = km * 0.1;


        System.out.print("Yas Giriniz :");
        yas = inp.nextInt();

        System.out.print("Tip Giriniz (1 => Tek Yon, 2 => Gidis Donus) :");
        tip = inp.nextInt();

        if (km < 0 || yas < 0 || tip < 0 || tip > 2) {
            System.out.println("Hatali deger girdiniz.");
        }
            if (yas < 12) {
                if(tip == 2){
                    yasIndırımı = normalTutar * 0.5;
                    indirimliTutar = normalTutar - yasIndırımı;
                    gidisDonusIndirimi = indirimliTutar * 0.2;
                    topTutar = (indirimliTutar - gidisDonusIndirimi)*2;
                    System.out.println("Indirimli fiyat : "+topTutar);
                }else {
                    yasIndırımı = normalTutar * 0.5;
                    indirimliTutar = normalTutar - yasIndırımı;
                    System.out.println("Toplam fiyat : "+indirimliTutar);
                }
            }else if (yas > 12 && yas < 24) {
                if(tip == 2){
                    yasIndırımı = normalTutar * 0.1;
                    indirimliTutar = normalTutar - yasIndırımı;
                    gidisDonusIndirimi = indirimliTutar * 0.2;
                    topTutar = (indirimliTutar - gidisDonusIndirimi)*2;
                    System.out.println("Toplam fiyat :" +topTutar );
                }else {
                    yasIndırımı = normalTutar * 0.1;
                    indirimliTutar = normalTutar - yasIndırımı;
                    System.out.println("Toplam fiyat : "+indirimliTutar);
                }
            }else if (yas > 65) {
                if(tip == 2) {
                    yasIndırımı = normalTutar * 0.3;
                    indirimliTutar = normalTutar-yasIndırımı;
                    gidisDonusIndirimi = indirimliTutar * 0.2;
                    topTutar = (indirimliTutar - gidisDonusIndirimi)*2;
                    System.out.println("Toplam fiyat :" +topTutar);
                }else {
                    yasIndırımı = normalTutar * 0.3;
                    indirimliTutar = normalTutar - yasIndırımı;
                    System.out.println("Toplam fiyat :" +indirimliTutar);
                }
            }else {
                if(tip == 2) {
                    gidisDonusIndirimi = normalTutar * (0.2);
                    topTutar = normalTutar - gidisDonusIndirimi;
                    topTutar *= 2;
                    System.out.println("Toplam fiyat :" +topTutar);
                }else {
                    System.out.println("Toplam fiyat :" +normalTutar);
                }
            }

    }
}
