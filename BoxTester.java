import java.util.*;
public class BoxTester {

    public static void main (String [] args){

        Box[] boxes = new Box[5];
        boxes[0] = new Box(1, 3, 22);
        boxes[1] = new Box(7, 7, 10);
        boxes[2] = new Box(9, 25, 11);
        boxes[3] = new Box(14, 3, 6);
        boxes[4] = new Box(2, 8, 1);

        System.out.println("\f");
        for (Box b : boxes)
            System.out.println(b.toString());

        System.out.println(">>>> After Sort >>>>");
        Arrays.sort(boxes);

        for (Box b : boxes)
            System.out.println(b.toString());    
    }
}