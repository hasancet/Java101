import java.util.Scanner;
public class DaireAlanCevreParca {
    public static void main(String[] args) {

        double r, pi=3.14,alan,cevre,parcaAlan,aci;

        Scanner inp = new Scanner(System.in);

        System.out.println("Yaricap giriniz :");

        r = inp.nextDouble();

        System.out.println("Merkez acinin olcusunu giriniz :");

        aci = inp.nextDouble();

        alan=r*r*pi;
        cevre=2*pi*r;
        parcaAlan=(alan*aci)/360;

        System.out.println("Tam Daire Alani :"+alan);
        System.out.println("Tam Daire Cevresi :"+cevre);
        System.out.println("Daire Diliminin Alani :"+parcaAlan);
    }
}
