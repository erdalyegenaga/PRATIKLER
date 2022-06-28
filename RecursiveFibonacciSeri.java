import java.util.Enumeration;
import java.util.Scanner;

public class RecursiveFibonacciSeri {
        static int fibonacci(int num){
        if (num==1 || num==2){
            return 1;
        }
         return fibonacci(num-1)+fibonacci(num-2);
        }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int input=sc.nextInt();
        System.out.println(fibonacci(input));
    }
}
