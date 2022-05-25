import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int mat,fizik,turkce,tarih,kimya,muzik;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + muzik);
        double sonuc = toplam / 5.0;
        System.out.println("NOT ORTALAMANIZ : " + sonuc);

    }
}
