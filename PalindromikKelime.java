import java.util.Arrays;
import java.util.Scanner;

public class PalindromikKelime {
        static boolean isPalindrome(String str) {
            for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
                if (str.charAt(i) != str.charAt(j)){
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String word = "";
            while (!word.equals("0")) {
                System.out.print("Bir kelime yaziniz : ");
                word = input.next();
                if (isPalindrome(word) && !word.equals("0")) {
                    System.out.println("-> " + word + " palindrom bir kelimedir.");
                } else if (!isPalindrome(word) && !word.equals("0")) {
                    System.out.println("-> " + word + " palindrom bir kelime degildir.");
                }
                System.out.println();
            }
            System.out.println("PROGRAM SONLANDIRILDI !");
        }
    }
