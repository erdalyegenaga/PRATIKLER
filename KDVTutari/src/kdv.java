import java.util.Scanner;
public class kdv {
    public static void main (String[] args){
        double tutar,kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Tutari giriniz : ");
        tutar = input.nextDouble();
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutari : " + tutar);
        System.out.println("KDV Orani : " + kdvOran);
        System.out.println("KDV Tutari : " +kdvTutar);
        System.out.println("KDV'li Tutari : " + kdvliTutar);


    }
}
