import java.util.Scanner;

public class BasamakSayisi {
    public static void main(String[] args) {
        int num, geciciSayi, total=0, basamakDegeri;

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz : ");
        num=sc.nextInt();
        geciciSayi=num;


        while (num != 0){
            basamakDegeri=num%10;
            total+=basamakDegeri;
            num/=10;
        }
        System.out.println( geciciSayi+" sayisinin basamak sayilarin toplami: "+total);
    }
}
