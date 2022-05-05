import java.util.Scanner;
public class Etkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the heat : ");
        heat = inp.nextInt();

        if(heat <5) {
            System.out.println("Go to sky");
        }else if(5 <= heat && heat <15) {
            System.out.println("Go to cinema");
        }else if (15 <= heat && heat <25){
            System.out.println("Go to picnic");
        }else {
            System.out.println("Go to swimming ");
        }

    }
}
