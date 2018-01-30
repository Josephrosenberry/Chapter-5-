/**
 * Task class that creates, compares, and sets priority values to tasks
 * @author Joseph Rosenberry
 * @version 1/30/2018
 */
public class Task implements Priority, Comparable {

    private String name = "";
    private int priority;

    /**
     * Creates a task object with a name
     * @param n Name of the object
     */
    public Task (String n){
        name = n;
    }
    /**
     * Obtain and returns name of object
     * @return name of object
     */
    public String getName(){
        return name;
    }
    /**
     * Set the priority value of each task
     * @param p Priority value
     */
    public void setPriority (int p) {
        priority = p;
    }
    /**
     * Obtains the priority value of each task
     * @return priority value
     */
    public int getPriority (){
        return priority;
    }
    /**
     * String message of the name of the task and its value
     * @return name  Name of object
     * @return priority Priority of balue
     */
    public String toString(){
        return name + "\t" + "Priority level: " + priority;
    }
    /**
     * Compares the object task with another task and returns if it is 
     * greater or equal to or less than.
     * @return value that shows if it is less than, greater than, or equal to
     */
    public int compareTo(Object o){
        Task t = (Task) o;
        return this.priority - t.getPriority();
    } 
    /**
     * Compares the two tasks and shows if they are greater than, equal to, or less than
     * @param t1 First task passed as a comparing paramater
     * @param t1, Second task passed as a comparing parameter 
     */
    public static void comparePriorities(Task t1, Task t2){
        if (t1.compareTo(t2)==0)
            System.out.println("" + t1.getName() + " has an equal priority to " + t2.getName());
        else if (t1.compareTo(t2) < 0)
            System.out.println("" + t1.getName() + " has a lower priority than " + t2.getName());
        else
            System.out.println("" + t1.getName() + " has a higher priority than " + t2.getName());
        }
    
    
}