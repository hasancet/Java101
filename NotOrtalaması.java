import java.util.Scanner;
public class NotOrtalaması {
    public static void main(String[] args) {
        //Değişkenleri oluştur.
        int mat,fiz,kimya,turkce,tarih,muzik;

        //Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner (System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz :");
        fiz = inp.nextInt();

        System.out.print("Turkce Notunuz :");
        turkce=inp.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih=inp.nextInt();

        System.out.print("Muzik Notunuz :");
        muzik=inp.nextInt();

        int toplam = (mat+fiz+turkce+tarih+muzik);
        double sonuc = toplam/5.0;
        System.out.println("Ortalamanız :" + sonuc);
        String durum = (sonuc>60)? "Sinifi Gecti":"Sinifi Kaldi";
        System.out.println("Sinifi Gecip Gecmeme Durumu:"+durum);
    }
}
