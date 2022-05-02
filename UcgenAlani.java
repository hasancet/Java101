import java.util.Scanner;
public class UcgenAlani {
    public static void main(String[] args) {
        double a,b,c,u,alan;
        Scanner inp = new Scanner(System.in);

        System.out.println("Birinci Kenari Giriniz :");
        a = inp.nextInt();
        System.out.println("Ikinci Kenari Giriniz :");
        b = inp.nextInt();
        System.out.println("Ucuncu Kenari Giriniz :");
        c = inp.nextInt();

        u = (a+b+c) / 2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Ucgenin alani : "+alan);
    }
}
