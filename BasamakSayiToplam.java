package Donguler;

import java.util.Scanner;

public class BasamakSayiToplam {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayi giriniz :");
        int sayi = inp.nextInt();
        int total = 0;

        do {
            int lastDigit = sayi % 10;
            sayi = sayi / 10;
            System.out.print(lastDigit);
            if (sayi != 0) {
                System.out.print("+");
            }

            total += lastDigit;

        } while (sayi!=0);

        System.out.println("="+total);





    }
}
