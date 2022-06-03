import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int num1, num2, smallNum, bigNum;

        Scanner input = new Scanner(System.in);
        System.out.print("First number : ");
        num1 = input.nextInt();
        System.out.print("Second number : ");
        num2 = input.nextInt();

        if (num1 > num2) {
            smallNum = num2;
            bigNum = num1;
        } else {
            smallNum = num1;
            bigNum = num2;
        }

        for (int i = smallNum; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("EBOB: " + i);
                break;
            }
        }

        for (int i = bigNum; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println("EKOK: " + i);
                break;
            }
        }
    }
}