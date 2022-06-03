import java.util.Scanner;

public class ATMSwitch {
    public static void main(String[] args) {

        String userName, password;
        int right = 3, balance = 1500, selection;
        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Username : ");
            userName = input.nextLine();

            System.out.print("Password : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello, Welcome!");

                do {
                    System.out.println("1- Para Yatirma\n" + "2- Para Cekme\n" + "3- Bakiye Sorgulama\n" + "4- Cikis Yap");
                    System.out.print("Please select the action you want to do : ");
                    selection = input.nextInt();

                    switch (selection){
                        case 1:
                            System.out.print("Enter the amount of money you want to deposit : ");
                            int yatirPara = input.nextInt();
                            balance += yatirPara;
                            break;

                        case 2:
                            System.out.print("Enter the amount of money you want to withdraw : ");
                            int cekPara = input.nextInt();

                            if (cekPara > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= cekPara;
                            }
                            break;
                        case 3:
                            System.out.println("Your Balance is : " + balance);
                            break;
                    }
                } while (selection != 4);
                System.out.println("See you again.");
                break;
            } else {
                right--;
                System.out.println("Wrong username or password. Try again.");

                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                } else {
                    System.out.println("Your Remaining Rights : " + right);
                }
            }

        }
    }
}