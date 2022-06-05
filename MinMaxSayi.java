import java.util.Scanner;

public class MinMaxSayi {
    public static void main(String[] args) {

        int k, sayi, min=0, max=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz >>> ");
        k = input.nextInt();

        for (int i=1; i<=k; i++){
            System.out.print(i + ". sayiyi giriniz : " );
            sayi = input.nextInt();

            if (i==1){
                max = sayi;
                min = sayi;
            }else{
                if(sayi>max){
                    max = sayi;
                } else if (sayi<min) {
                    min = sayi;
                }
            }
        }
        System.out.println("Max = " + max );
        System.out.println("Min = " + min);
    }
}
