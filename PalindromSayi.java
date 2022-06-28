import java.util.Scanner;

public class PalindromSayi {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNum = 0, lastNum;
        while (temp != 0) {
            lastNum = temp % 10;
            reverseNum = (reverseNum * 10) + lastNum;
            temp = temp / 10;
        }
                if (number == reverseNum) {
                    System.out.println("Palindrom sayidir.");
                    return true;
                } else {
                    System.out.println("Palindrom sayi degildir.");
                    return false;
                }
            }
            public static void main (String[] args){

                Scanner inp = new Scanner(System.in);
                System.out.print("Bir sayi giriniz:");
                int n = inp.nextInt();
                System.out.println(isPalindrom(n));
                ;


            }
        }
    1



