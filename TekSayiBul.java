import java.util.Scanner;

public class TekSayiBul {
    public static void main(String[] args) {
        int n,toplam = 0;
        Scanner scan = new Scanner(System.in);

            System.out.print("Bir Tamsayi Giriniz : ");
            n = scan.nextInt();

          while (n>0){
              if (n%2==1){
                  toplam += n;

              }
              System.out.print("Bir Tamsayi Giriniz : ");
              n= scan.nextInt();
          }
        System.out.println("Toplam :" + toplam);

    }
}
