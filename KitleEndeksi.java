import java.util.Scanner;
public class KitleEndeksi {
    public static void main(String[] args) {
        double boy,kilo,indeks;
        Scanner inp = new Scanner(System.in);
        System.out.println("Boyunuzu m cinsinden giriniz : ");
        boy = inp.nextDouble();
        System.out.println("Kilonuzu kg cinsinden giriniz : ");
        kilo = inp.nextDouble();
        indeks = kilo / (boy*boy);
        System.out.println("Vucut Kitle Indeksiniz : " + indeks);

    }
}
