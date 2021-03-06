/**
 * Driver class that creates accounts with a balance, an owner name, and an
 * id number and can deposit or withdraw money
 * @author Joseph Rosenberry
 * @version 1/16/2018
 */
public class AccountTest{
    
    public static void main (String [] args){
        System.out.println("\f");
        Account acct1 = new Account(1000, "John", 1234);
        Account acct2 = new Account ("Sally");
        Account acct3 = new Account (5500, "Tommy");
    
        acct1.deposit(100);
        acct1.withdraw(500);
        System.out.println(acct1);
        
        acct2.deposit(5000);
        acct2.withdraw(150, 2.50);
        acct2.withdraw(5000);
        System.out.println(acct2);
        
        acct3.withdraw(500);
        System.out.println(acct3);
    }
}