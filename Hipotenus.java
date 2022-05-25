import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        int a,b;
        double c;

        Scanner input = new Scanner(System.in);
        System.out.println("1. Kenar uzunlugu : " );
        a = input.nextInt();
        System.out.println("2. Kenar uzunlugu : ");
        b = input.nextInt();

        c= Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus : " + c);

    }


}
