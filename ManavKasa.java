import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domat=1.11,
                muz=0.95,patl=5.0,toplam,
                armutKilo,elmaKilo,muzKilo,
                patlKilo,domatKilo;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut miktari :");
        armutKilo = inp.nextDouble();
        System.out.print("Elma miktari :");
        elmaKilo = inp.nextDouble();
        System.out.print("Domates miktari :");
        domatKilo = inp.nextDouble();
        System.out.print("Muz miktari :");
        muzKilo=inp.nextDouble();
        System.out.print("Patlican miktari :");
        patlKilo= inp.nextDouble();

        toplam=(armutKilo*armut)+(elmaKilo*elma)+(domatKilo*domat)+
                (muzKilo*muz)+(patlKilo*patl);

        System.out.println("Toplam tutar :" + toplam);
    }
}
