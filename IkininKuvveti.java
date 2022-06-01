import java.util.Scanner;

public class IkininKuvveti {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz : ");
        int sayi=sc.nextInt();

        System.out.println( sayi+ " sayisindan kucuk 4'un kuvvetleri : ");
        for (int i=1; i<=sayi; i*=4){
            System.out.println(i + "   ");
        }

        System.out.println( sayi+ " sayisindan kucuk 5'in kuvvetleri : ");
        for (int i=1; i<=sayi; i*=5){
            System.out.println(i + "   ");
        }
    }
}
