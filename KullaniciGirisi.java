import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String username, password;
        String nPass;
        int newPassword;
        int button;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici Adiniz : ");
        username = input.nextLine();

        System.out.print("Sifreniz : ");
        password = input.nextLine();

        if (username.equals("erdal") && password.equals("patika123")){
            System.out.println("GIRIS YAPTINIZ ! ");

        }else {
            System.out.println("! BILGILERINIZ YANLIS !   Yeni Sifre Belirlemek Icin '1'i, Iptal Icin '2'yi Tuslayin.  ");
        }
        button = input.nextInt();
        input.nextLine();

        switch (button) {
            case 1:
                System.out.println("Yeni Bir Sifre Belirleyiniz : ");
                nPass = input.nextLine();

                if (nPass.equals(password)) {System.out.println("Yeni sifreniz bir onceki sifreniz ile ayni olamaz.");
                } else {
                    System.out.println("Sifreniz basari ile degistilidi.");
                    System.out.println("Yeni sifreniz :" + nPass );
                }
                break;
            case 2:
                System.out.println("Sifre degistirilme islemini iptal ettiniz.");
                break ;

        }
}}
