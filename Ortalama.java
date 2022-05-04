import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int k, toplam=0, ort=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayi Giriniz :");
        k = inp.nextInt();

        for(int i=1; i<=k; i++) {

            if((i%3 == 0) && (i%4 ==0)) {
                toplam += i;
                ort++;
            }
        }
        System.out.print("Ortalama :"+(toplam=toplam/ort));

    }
}
