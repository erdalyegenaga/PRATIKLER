import java.util.Scanner;

public class RecursiveDesen {
    static int desenCikar(int num) {
        if (num <= 0) {
            return num;
        }
        System.out.print(num + " ");
        return desenCikar(num - 5);
    }

    static int desenTopla(int cikarSayi, int num) {
        if (cikarSayi > num) return cikarSayi;
        System.out.print(cikarSayi + " ");
        return desenTopla(cikarSayi + 5, num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N Sayisi : ");
        int sayi = sc.nextInt();
        desenTopla(desenCikar(sayi), sayi);

    }
}