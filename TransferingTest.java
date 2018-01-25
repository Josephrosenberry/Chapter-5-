/**
 * Driver class that can transfer money between two accounts and 
 * display the details for each account
 * @version 1/25/2018
 * @author Joseph Rosenberry
 */
import java.util.*;
public class TransferingTest{
    public static void main (String [] args){

        System.out.println("\f");
        Account3 acct1, acct2;
        double amount;
        double acctNumber;
        String keepGoing = "y";
        String acting;
        int count = 1;
        int input, input2;

        Scanner scan = new Scanner (System.in);
        acct1 = new Account3 (1000, "Sue");
        System.out.println("Account 1: Sue, Balance is " + acct1.getBalance());

        System.out.println(acct1.toString());
        System.out.println("Next account number: " + Account3.getNextNum() + "\n");
        acct2 = new Account3 (1000, "Joe");
        System.out.println("Account 2: Joe, Balance is " + acct2.getBalance());
        System.out.println(acct2.toString());
        System.out.println("Next account number: " + Account3.getNextNum());
        System.out.println("\nWhich of the following would you like to do? \n");
        System.out.println("1. Transfer money from " +  acct1.getName() + "to " + acct2.getName());
        System.out.println("1. Transfer money from " + acct2.getName() + "to " + acct1.getName());
        System.out.print("3. Quit \nPlease select 1, 2, or 3: ");
        input = scan.nextInt();
        System.out.println("\n");
        while (input != 3){
            if (input == 1){
                System.out.println("Transferring money from Joe's Account to Sue's Account");
                System.out.println("Enter amount you would like to transfer");
                amount = scan.nextDouble();
                acct1.transfer(acct2, amount);
                System.out.println("\nAccount #1's Balance: " + acct1.getBalance());
                System.out.println("Account #2's Balance: " + acct2.getBalance());
            }
            else if (input == 2){
                System.out.println("Transferring money from Sue's Account to Joe's Account");
                System.out.println("Enter amount you would like to transfer");
                amount = scan.nextDouble();
                acct2.transfer(acct1, amount);
                System.out.println("\nAccount #1's Balance: " + acct1.getBalance());
                System.out.println("Account #2's Balance: " + acct2.getBalance());
                System.out.println("\n");
            }
            else {
                System.out.println("You chose to quit");
            }
            System.out.println("\nWould you like to transfer again? SELECT 1, 2, or 3");
            input = scan.nextInt();

        }

        System.out.println(" \n******************* Testing static transfer method ****************");
        System.out.println("Which of the following would you like to do?");
        System.out.println("1. Transfer money from " + acct1.getName() + "to " + acct2.getName());
        System.out.println("1. Transfer money from " +  acct2.getName()  + "to " + acct1.getName());
        System.out.println("3. Quit \nPlease select 1, 2, or 3: " + "\n");
        input2 = scan.nextInt();
        while (input2 != 3){
            if (input2 == 1){
                System.out.println("Transferring money from Joe's Account to Sue's Account");
                System.out.println("Enter amount you would like to transfer");
                amount = scan.nextDouble();
                acct1.transfer(acct1,acct2, amount);
                System.out.println("\nAccount #1's Balance: " + acct1.getBalance());
                System.out.println("Account #2's Balance: " + acct2.getBalance());
            }
            else if (input2 == 2){
                System.out.println("Transferring money from Sue's Account to Joe's Account");
                System.out.println("Enter amount you would like to transfer");
                amount = scan.nextDouble();
                acct2.transfer(acct2,acct1, amount);
                System.out.println("\nAccount #1's Balance: " + acct1.getBalance());
                System.out.println("Account #2's Balance: " + acct2.getBalance());
            }
            else {
                System.out.println("You chose to quit");
            }
            System.out.println("Which of the following would you like to do?");
        System.out.println("1. Transfer money from account1 to account2");
        System.out.println("2. Transfer money from account2 to account1");
        System.out.print("3. Quit \n\nPlease select 1, 2, or 3: ");
        input2 = scan.nextInt();
            
        }
        System.out.println("Account #1: " + acct1.toString());
        System.out.println("Account #2: " + acct2.toString());
    }
}
