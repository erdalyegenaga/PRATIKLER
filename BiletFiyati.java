import java.util.Scanner;

public class BiletFiyati {
    public static void main(String[] args) {
        double biletFiyati = 0.0, mesafe, mesafeUcreti=0.10;
        int yas, yolculukTipi;
        boolean Hata = false;

        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi KM Cinsinden Giriniz : ");
        mesafe = inp.nextInt();

        System.out.print("Yasinizi Giriniz : ");
        yas = inp.nextInt();

        System.out.print("Yolculuk Tipini Giriniz (Tek Yon icin: 1, Gidis Donus icin: 2): ");
        yolculukTipi = inp.nextInt();

        biletFiyati = mesafe * mesafeUcreti;


        switch (yolculukTipi) {
            case 1:
                biletFiyati = biletFiyati;
                break;
            case 2:
                biletFiyati*=2*0.8;
                break;
            default:
                Hata=true;
        }
        if(!Hata){
            if (0<yas && yas<12){
                biletFiyati*=0.5;
                System.out.println("Bilet Fiyatiniz: " + biletFiyati+" TL");

            } else if (12<=yas && yas<24) {
                biletFiyati*=0.9;
                System.out.println("Bilet Fiyatiniz: " + biletFiyati+" TL");

            } else if (24<=yas && yas<65) {
                biletFiyati=biletFiyati;
                System.out.println("Bilet Fiyatiniz: " + biletFiyati+" TL");

            }else if (yas>65) {
                biletFiyati*=0.7;
                System.out.println("Bilet Fiyatiniz: " + biletFiyati+" TL");

            }else {
                System.out.println("Hatali Veri Girdiniz");
            }
        }else {
            System.out.println("Hatali Yolculuk Tipi Girdiniz. Lutfen 1 veya 2 Giriniz");
        }

    }
    }

