/**
 * A bank account class with methods to deposit to, withdraw from, of the account.
 * @author Joseph Rosenberry
 * @version 1/11/2018
 */
public class Account
{
    private double balance;
    private String name;
    private int acctNum;
    /**
     * Creates an account method that takes a double and a string variable which represents
     * the initial balance and owner name
     * @param initBal - Initial balance of the account
     * @param owner - Name of the account
     */
    public Account (double initBal, String owner)
    {
        balance = initBal;
        name = owner;
        acctNum =  (int)(Math.random() * 8999) + 1000;
    }

    /**
     * initializes account number and owner name and balance
     * @param initBal - Initial balance of the account
     * @param owner - name of the account
     * @param number - Account number of the account
     */
    public Account(double initBal, String owner, int number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
    }

    /**
     * Initializes the account with someones name
     * @param owner - Name of the account number;
     */
    public Account(String owner){
        name = owner;
        balance = 0;
        acctNum =  (int)(Math.random() * 8999) + 1000;
    }

    /**
     * Checks to see if balance is sufficient for withdrawal.
     * If so, decrements balance by amount; if not, prints message.
     * @param amount - Amount set to the account
     */
    public void withdraw(double amount)
    {
        if (balance >= amount){
            balance -= amount;
            System.out.println("Withdraw $" + String.format("%.2f", amount) + " from " + name + "'s account. New balance is $" + String.format("%.2f", balance));
        }
        else{
            System.out.println("Insufficient funds");
        }
    }

    /**
     * a method to initializes the amount and fee and deduct the amount from the balance
     * @param amount Amount set to the account
     * @param fee Fee % deducted for each account
     */
    public void withdraw (double amount, double fee)
    {
        if (balance  >= amount + fee){
            balance -= amount + fee;
            System.out.println("Withdraw $" + String.format("%.2f",amount) + " plus $" + fee + " fee from " + name + "'s account. New balance is $" + String.format("%.2f", balance));
        }
        else
            System.out.println("Insufficient funds\n");

    }

    /**
     * takes a double for the amount of a deposit and adds it to the balance
     * @param amount - Amount deposited into the account
     */
    public void deposit(double amount)
    {
        balance += amount;

    }

    /**
     * returns the balance for each account
     * @return balance 
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * obtains and returns account name
     * @return name of owner
     */
    public String getName()
    {
        return name;
    }

    /**
     * toString method to return a print statement of the accounts number, balance, and owner name
     * @return balance, acctNum, name
     */
    public String toString(){
        return name + "'s account number is " + acctNum + ". Balance is $" + String.format("%.2f",balance) + "\n";
    }
}