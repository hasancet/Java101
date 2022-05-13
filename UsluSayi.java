package Donguler;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int n,k ;
        Scanner inp = new Scanner(System.in);

        System.out.println("Ussu alinacak sayi :");
        n = inp.nextInt();
        System.out.println("Us olacak sayi :");
        k = inp.nextInt();

        int i = 1;
        int total = 1;
        for(i=1; i<=k; i++){
            total*=n;
        }
        System.out.println("total :" + total);

    }
}
