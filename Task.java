public class Task implements Priority {

    private String priority, msg;
    private int amount;

    public Task() {
        this.msg = msg;
        this.amount = amount;

        if (amount == 1)
            priority = "Not important";
        if (amount > 1 && amount < 4 )
            priority = "Low importance";
        if (amount >= 4 && amount < 7 )
            priority = "Important";
        if (amount >= 7 && amount < 10 )
            priority = "Very important";
        if (amount == 10)
            priority = "Critically important";
    }

    public Task (String name, int i){
    }
    
    public void setPriority (int amount) {
        this.amount = amount;
        
         if (amount == 1)
            priority = "Not important";
        if (amount > 1 && amount < 4 )
            priority = "Low importance";
        if (amount >= 4 && amount < 7 )
            priority = "Important";
        if (amount >= 7 && amount < 10 )
            priority = "Very important";
        if (amount == 10)
            priority = "Critically important";
    }
    public int getPriority (){
        return amount;
    }
    public String toString(){
        return msg + "\t" + "Priority level: " + amount + "\t" + priority;
    }

    
    
}