import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        boolean artikYil=false;
        int yil;

        Scanner input = new Scanner(System.in);
        System.out.print("Yil Giriniz : ");
        yil=input.nextInt();

        if (yil % 4 == 0){
            if (yil % 100 == 0){
                if (yil % 400 == 0){
                    artikYil=true;
                }else{
                    artikYil=false;
                }
                }else{
                    artikYil=true;
            }
                }else {
                    artikYil=false;
        }
        if (artikYil){
            System.out.print("Artik bir yildir = " + yil);
        }else {
            System.out.print("Artik bir yil değildir = " + yil);
        }
    }
}
