import java.util.Scanner;

public class SinifGecme {

    public static void main(String[] args) {
        int mat, fzk, kmy, msc, trk, total = 0;
        double counter = 0;
        Scanner inp = new Scanner(System.in);


        System.out.print("Maths Enter Score :");
        mat = inp.nextInt();
        if (!(mat <= 0 || mat >= 100)) {
            total += mat;
            counter++;
        }
        System.out.print("Physics Enter Score :");
        fzk = inp.nextInt();
        if (!(fzk <= 0 || fzk >= 100)) {
            total += fzk;
            counter++;
        }
        System.out.print("Music Enter Score :");
        msc = inp.nextInt();
        if (!(msc <= 0 || msc >= 100)) {
            total += msc;
            counter++;
        }
        System.out.print("Chemical Enter Score :");
        kmy = inp.nextInt();
        if (!(kmy <= 0 || kmy >= 100)) {
            total += kmy;
            counter++;
        }
        System.out.print("Turkish Enter Score :");
        trk = inp.nextInt();
        if (!(trk <= 0 || trk >= 100)) {
            total += trk;
            counter++;
        }

        if (total/counter<55){
            System.out.println("Your failed the class");
        }else{
            System.out.println("Your Passed");
        }

        System.out.println("Avarage : " +total/counter);



    }
}
