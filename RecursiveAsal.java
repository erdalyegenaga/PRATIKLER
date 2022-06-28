import java.util.Scanner;

public class RecursiveAsal {
    static  boolean asal(int num, int i) {
        if (num <= 2) {
            return (num == 2) ? true : false;
        }
            if (num % i == 0){
                return false;
            }

            if (i * i > num){
                return true;
            }
            return asal(num, i + 1);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int num = sc.nextInt();

        if (asal(num, 2)) {
            System.out.println(num + " sayisi asal sayidir. ");
        } else {
            System.out.println(num + " sayisi asal sayi degildir.");
        }
    }}
