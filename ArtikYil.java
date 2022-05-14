import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Yılı Girin: ");
        int yil = scn.nextInt();
        boolean isArtikYil;

        if(yil%100 == 0){

            if (yil%400 == 0){
                isArtikYil = true;
            }else{
                isArtikYil = false;
            }
        }else if(yil%4 == 0 ){
            isArtikYil = true;
        }else{
            isArtikYil = false;
        }

        String yazdir = isArtikYil ? (yil + " yili artık bir yildir !") : (yil + " yili artık bir yil degildir !.");
        System.out.println(yazdir);
    }
}










