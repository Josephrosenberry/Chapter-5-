/**
 * Driver class that initializes the task objects and gives them values
 * @author Joseph Rosenberry
 * @version 1/30/2018
 */
public class TaskTest{
    public static void main(String [] args){
        System.out.println("\f");
        Task[] tasks = new Task[5];
        tasks [0] = new Task("Eat\t");
        tasks [1] = new Task("Sleep\t");
        tasks [2] = new Task("Play\t");
        tasks [3] = new Task("APCSProgram");
        tasks [4] = new Task("Exercise");

        tasks[0].setPriority(3);
        tasks[1].setPriority(Priority.MAX_PRIORITY);
        tasks[2].setPriority(2);
        tasks[3].setPriority(Priority.MED_PRIORITY);
        tasks[4].setPriority(Priority.MIN_PRIORITY);

        for (Task a: tasks){
            System.out.println(a);
        }
        System.out.println();
        Task.comparePriorities(tasks[0], tasks[1]);
        Task.comparePriorities(tasks[0], tasks[2]);
        Task.comparePriorities(tasks[0], tasks[3]);
        Task.comparePriorities(tasks[0], tasks[4]);
    }
}