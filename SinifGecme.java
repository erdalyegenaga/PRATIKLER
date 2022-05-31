import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int matematik,fizik,turkce,kimya,muzik;

        Scanner input =new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik = input.nextInt();

        double average = (matematik + fizik + turkce + kimya + muzik) / 5;
        if(average<=55){
            System.out.println("Sinifta Kaldiniz.");
            System.out.println("Ortalamaniz : " + average);
        }else{
            System.out.println("Tebrikler, Sinifi Gectiniz !!! ");
            System.out.println("Ortalamaniz " + average);
        }

    }
}
