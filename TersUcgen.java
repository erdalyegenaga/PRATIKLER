import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayisini giriniz : ");
        int sayi = input.nextInt();

        /* for (int i=sayi; i>0; i--){
            for (int k=sayi-i; k>0; k--){
                System.out.print(" ");
            }
            for (int j=(2*i)-1; j>0; j--){
                System.out.println("*");
            }
            System.out.println(" "); */
        for (int k=1;k<=sayi;k++){

            for (int x=1;x<=k;x++){
                System.out.print(" ");
            }
            for (int y=1;y<=2*(sayi-k+1)-1;y++){
                System.out.print("*");
            }
            System.out.println();
        }}
        }


