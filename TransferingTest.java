import java.util.*;
public class TransferingTest{
        public static void main (String [] args){
            
            Account acct1, acct2;
            double amount;
            double acctNumber;
            String keepGoing = "y";
            String acting;
            int count = 1;
            int input;
            
            Scanner scan = new Scanner (System.in);
            
            acct1 = new Account (1000, "Sue", 123);
            acct2 = new Account (100, "Joe", 456);
            
            System.out.println("These are the following accounts: ");
            System.out.println(acct1.toString() + "\n");
            System.out.println(acct2.toString());
            
            System.out.println("Which of the following would you like to do?");
            System.out.println("1. Transfer money from account1 to account2");
            System.out.println("2. Transfer money from account2 to account1");
            System.out.println("3. Quit \nPlease select 1, 2, or 3: ");
            input = scan.nextInt();
        }
    }