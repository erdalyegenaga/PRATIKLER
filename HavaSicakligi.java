import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
         int sicaklik;
         Scanner input = new Scanner(System.in);
         System.out.print("Sicaklik Degerini Derece Cinsiniden Giriniz : ");
         sicaklik = input.nextInt();
         String sc = (sicaklik<5) ? "Kayak Yapabilirsiniz" :( (5<=sicaklik && sicaklik<15) ? "Sinemaya Gidebilirsiniz" :( (15<=sicaklik && sicaklik<25) ? "Piknige Gidebilirsiniz" : "Yuzmeye Gidebilirsiniz"));
        System.out.println(sc);

    }
}
