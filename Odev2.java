import java.util.Scanner;
public class Odev2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);

        int yil;

        System.out.print("Dogum yilinizi giriniz :");
        yil = inp.nextInt();

        if(yil %12 == 0) {
            System.out.print("MAYMUN");
        }else if(yil %12 ==1) {
            System.out.println("HOROZ");
        }else if(yil %12 ==2) {
            System.out.println("KOPEK");
        }else if(yil %12 ==3) {
            System.out.println("DOMUZ");
        }else if(yil %12 ==4) {
            System.out.println("FARE");
        }else if(yil %12 ==5) {
            System.out.println("OKUZ");
        }else if(yil %12 ==6) {
            System.out.println("KAPLAN");
        }else if(yil %12 ==7) {
            System.out.println("TAVSAN");
        }else if(yil %12 ==8) {
            System.out.println("EJDERHA");
        }else if(yil %12 ==9) {
            System.out.println("YILAN");
        }else if(yil %12 ==10) {
            System.out.println("AT");
        }else if(yil %12 ==11) {
            System.out.println("KOYUN");
        }





    }
}
