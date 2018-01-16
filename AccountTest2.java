/**
 * Main driver class for a number of accounts being created and 
 * gives an account number, a balance, and id number for each account
 * @author Joseph Rosenberry
 * @version 1/16/2017
 */
import java.util.*;
public class AccountTest2{
    
    public static void main (String [] args){
        
        Scanner scan = new Scanner (System.in);
        int numAccts;
        String name;
        System.out.println("\f");
        System.out.println("How many accounts will you be creating?");
        numAccts = scan.nextInt();

        
        
        for (int i = 1; i <= numAccts; i++){
            System.out.print("Enter the name of account #" + i + ": ");
            name = scan.next();
            Account2 acct = new Account2(100, name);
            System.out.println(acct.toString());
            System.out.println("Next id number is " + Account2.getNextNum());
    }
    System.out.println("\nEnd of program. \tGoodbye");
}
}