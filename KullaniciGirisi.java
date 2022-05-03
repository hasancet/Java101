import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;
        int secim;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanici Adiniz :");
        userName = inp.nextLine();

        System.out.print("Sifreniz :");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giris yaptiniz.");

        } else if (!userName.equals("patika") && password.equals("java123")) {
            System.out.println("Kullanic adiniz yanlis.");
        } else if (userName.equals("patika") && !password.equals("java123")) {
            System.out.println("Sifreniz yanlis.");

            System.out.println("Sifrenizi sifirlamak ister misiniz ?");
            System.out.println("1-Evet 2-Hayir");
            secim = inp.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Yeni sifreniz :" +inp.nextLine());
                    String newPassword = inp.nextLine();

                    if (newPassword.equals("java123")) {
                        System.out.println("Yeni sifre, eski sifreyle ayni olamaz.");
                    } else {
                        System.out.println("Sifreniz basariyla degistirildi.");
                    }
                    break;
                case 2:
                    System.out.println("Sifre sifirlanmadi.");
                    break;
            }
        }else {
            System.out.print("Tekrar deneyiniz.");
        }
    }
}
