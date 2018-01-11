import java.util.*;
public class AccountTest2{
    
    public static void main (String [] args){
        
        Scanner scan = new Scanner (System.in);
        int numAccts;
        String name;
        
        System.out.println("How many accounts will you be creating?");
        numAccts = scan.nextInt();
        
        
        for (int i = 1; i < numAccts; i++){
            System.out.print("Enter the name of account #" + 1 + ": ");
            name = scan.next();
    }
}
}