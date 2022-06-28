import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int sum(int a, int b){
        int result = a+b;
        System.out.print("Toplam + " + result);
        return result;
    }
    static int minus(int a, int b){
        int result = a-b;
        System.out.println("Cikarma : " + result);
        return result;
    }
    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Carpma : " + result);
        return result;
    }
    static int divide(int a, int b) {
        if (b==0){
        return 0;
        }
        int result = a / b;
        System.out.println("Bolme : " + result);
        return result;
    }
    static int power(int a, int b){
        int result = 1;
        for (int i=1; i<=1; i++){
        result *= a;
        }
        return result;
    }
    static int mod(int a, int b){
        return a % b;
    }
    static void calc(int a, int b){
        System.out.println("Cevresi : " + (2*(a+b)));
        System.out.println("Alani : " + (a * b));

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İslemi\n"
                + "2- Cikarma İslemi\n"
                + "3- Carpma İslemi\n"
                + "4- Bolme islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve Cevre Hesabi\n"
                + "0- Cikis Yap";

        while (true) {
            System.out.println(menu);
            System.out.print("Bir islem seciniz : ");
            select = scan.nextInt();
            if (select == 0) {
                break;

            }
            System.out.print("Ilk Sayi : ");
            int a = scan.nextInt();
            System.out.print("Ikinci Sayi :");
            int b = scan.nextInt();
            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    if (divide(a,b) == 0){
                        System.out.println("Ikinci sayi 0'dan farkli olmalidir !");
                    }
                    break;
                case 5:
                    System.out.println("Us Hesabi " + power(a,b));
                    break;
                case 6:
                    System.out.println("Mod İslemi " +mod(a,b));
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Gecersiz Bir Islem Girdiniz !");

            }
        }
        System.out.println("Gule Gule...");
        }
    }

