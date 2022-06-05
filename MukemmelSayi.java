import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi, carpan=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz : ");
        sayi = input.nextInt();

        for (int i=0; i<sayi; i++){
            if (sayi%i==0){
                carpan += i;
            }
        }
        if (carpan==sayi){
            System.out.println(sayi + " MUKEMMEL SAYI ");
        }else{
            System.out.println(sayi + " MUKEMMEL SAYI DEGİLDİR ! ");
        }
    }
}
