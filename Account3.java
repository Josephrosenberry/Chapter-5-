/**
 * A bank account class with methods to deposit to, withdraw from, change the name on,
 * and get a String representation
 * of the account.
 * @author Joseph Rosenberry
 * @version 1/16/2018
 */
public class Account3
{
    private double balance;
    private String name;
    private int acctNum;
    private static int nextAccountNum = 1000;
    
    /**
     * Creates an account method that takes a double and a string variable which represents
     * the initial balance and owner name
     * @param initBal - Initial balance of the account
     * @param owner - Name of the account
     */
    public Account3 (double initBal, String owner)
    {
        balance = initBal;
        name = owner;
        acctNum = nextAccountNum;
        nextAccountNum++;
       
    }

    /**
     * Method to return nextNum 
     */
    public static int getNextNum(){
        return nextAccountNum;
    }
    
    /**
     * initializes account number and owner name and balance
     * @param initBal - Initial balance of the account
     * @param owner - name of the account
     * @param number - Account number of the account
     */
    public Account3(double initBal, String owner, int number)
    {
        balance = initBal;
        name = owner;
        acctNum = nextAccountNum++;
    }

    /**
     * Initializes the account with someones name
     * @param owner = name;
     */
    public Account3(String owner){
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
     * @param amount - Amount set to the account
     * @param fee - Fee % for each account
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
     * Returns balance of each account
     * @return balance 
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * obtains and returns account name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * transfers an amount from one account to another and subtracts the amount
     * @param acct Account being deposited too
     * @param amount Amount being deposited into the account
     */
    public void transfer (Account3 acct, double amount){
        balance -= amount;
        acct.balance += amount;
        System.out.println("Transferred " + amount + " from " + 
        this.name + "'s account to " + acct.name + "'s account.");
    }
        
    
    /**
     * toString method to return a print statement of the accounts number, balance, and owner name
     * @return balance
     * @return acctNum
     * @return name
     * @return nextAccountNum;
     */
    public String toString(){
        return name + "'s account number is " + acctNum + ". Balance is $" + String.format("%.2f",balance);
    }
    
    /**
     * Method that takes two accounts and transfers one of their amounts to the other
     * @param acct1 Account #1 that includes a name and balanced and ID Number
     * @param acct2 Account #2 that includes a name and balanced and ID Number
     * @param amount Amount being withdrawn from one account and deposited into another
     */
    public static void transfer (Account3 acct1, Account3 acct2, double amount) {
        acct1.withdraw(amount);
        acct2.deposit(amount);
    }
}
