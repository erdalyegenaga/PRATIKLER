import java.util.Scanner;

public class AsalSayilar {
    public static void main(String[] args) {

       /* String asalSayi= "";
        for (int i=0; i<=100; i++){
            int k=0;
            for (int j=i; j>=1; j++){
                if (i % j==0){
                    k++;
                }
            }
            if (k==2){
                asalSayi=asalSayi + i + " ";
            }

        }
        System.out.println(asalSayi); */
        int i=0,j=0;
        String primenum="";
        for (i=1;i<=100;i++){
            int count=0;

            for(j=i;j>=1;j--){

                if(i%j==0){
                    count+=1;
                }

            }

            if(count==2){
                primenum=primenum+i+" ";
            }

        }
        System.out.println(primenum);

    }
}
