public interface Priority {
    int priorityValue = 0;
    public static int MIN_PRIORITY = 1;
    public static int MED_PRIORITY = 5;
    public static int MAX_PRIORITY = 10;

    public void setPriority (int amount);

    public int getPriority ();
        
}