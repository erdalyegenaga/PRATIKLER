import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class SayiTahmin {
    public static void main(String[] args) {
        Random rnd = new Random();
        int num = rnd.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println("num");
        while(right < 5){
            System.out.println("Tahmininizi giriniz : ");
            selected = input.nextInt();
            if (selected < 0 || selected > 99){
                System.out.println("Lutfen 0-100 arasinda bir sayi giriniz : ");
                if (isWrong){
                    right++;
                    System.out.println("Hatali giris yaptiniz. Kalan hakkiniz : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("");
                }
                continue;
            }
            if (selected == num){
                System.out.println("TEBRIKLER, Dogru Tahmin ! ");
                isWin = true;
                break;
            }else{
                System.out.println("Hatali bir sayi girdiniz !");
                if (selected > num){
                    System.out.println(selected + " sayisi, gizli sayidan buyuktur. ");
                }else{
                    System.out.println(selected + " sayisi, gizli sayidan kucuktur. ");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hakkiniz : " + (5 - right));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
        input.close();

    }
}
