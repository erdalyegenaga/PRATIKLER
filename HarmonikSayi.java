import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N sayisini giriniz : ");
        int n = input.nextInt();
        double result=0.0;

        for (int i=; i<=n; i++){
            result += (1.0/i);
        }

        System.out.println(result);
    }
}