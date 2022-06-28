import java.util.Scanner;

public class RecursiveUs {
    static  int usAlma(int taban, int us){
        if(us==0) return 1;
        return taban * usAlma(taban,us-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban sayisini giriniz: ");
        int taban = sc.nextInt();
        System.out.print("Ussu giriniz: ");
        int us = sc.nextInt();
        System.out.println("Sonuc = " + usAlma(taban, us));
    }
}
