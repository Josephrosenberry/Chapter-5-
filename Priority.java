/**
 * interface that sets priorities and gets priorities
 * @author Joseph Rosenberry
 * @version 1/30/2018
 */
public interface Priority {
    static final int MIN_PRIORITY = 1;
    static final int MED_PRIORITY = 5;
    static final int MAX_PRIORITY = 10;

    public void setPriority (int p);

    public int getPriority();
        
}