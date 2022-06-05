import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int x=0, y=1, z;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci eleman sayisini giriniz : ");
        int k = input.nextInt();

        for (int i=1; i<=k; i++){
            z=y+x;
            if (x==0){
                System.out.print(x);
                if (i==1){
                    System.out.print("-" + i);

                    System.out.print("-"+k);
                    x=y;
                    y=z;
                }
            }
        }

    }
}
