import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n,r,kombinasyon;
        int nToplam=1, rToplam=1, nrToplam=1;


        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayi Girin : ");
        n=input.nextInt();
        System.out.print("Bir Sayi Girin : ");
        r= input.nextInt();

        int nr=n-r;
        for (int i=1; i<=n; i++){
            nToplam*=i;
        }
        for (int i=1; i<=r; i++){
            rToplam*=i;
        }
        for (int i=1; i<=nr; i++){
            nrToplam*=i;
        }
        kombinasyon=nToplam/(rToplam*nrToplam);
        System.out.println(n+ "'in "+r+"'li kombinasyonu C("+n+","+ r+"): "+ kombinasyon);

    }
    }

