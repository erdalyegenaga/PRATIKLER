import java.util.Scanner;

public class CiftSayi {
    public static void main(String[] args) {
        int k,i=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi Giriniz : ");
        k = input.nextInt();

        while (k<=i){
            if (k %2 ==0){
                System.out.println(k);
            }
            k++;
        }
    }
}
