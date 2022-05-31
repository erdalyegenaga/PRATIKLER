import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk Sayiyi Giriniz : " );
        n1 = input.nextInt();
        System.out.println("Ikinci Sayiyi Giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println(" Yapmak istediginiz secim nedir : ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplama Sonucu : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma Sonucu : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma Sonucu : " + (n1 * n2));
                break;
            case 4:
                if (n2!=0){
                    System.out.println("Bolme Sonucu : " + (n1 / n2));
                } else {
                    System.out.println("Sayi SIFIR'a Bolunemez");
                }
                break;
            default:
                System.out.println("Yanlis Secim! Tekrar Deneyiniz");




        }



    }

}
