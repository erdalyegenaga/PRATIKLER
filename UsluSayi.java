import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Ussu alinacak sayi : ");
        n = input.nextInt();
        System.out.print("Us olacak sayi : ");
        k = input.nextInt();

        int toplam = 1;
        for (int i=1; i<=k; i++){
            toplam *= i;

        }
        System.out.print( " sayisinin " + k + " uslu " + toplam);
    }
}
