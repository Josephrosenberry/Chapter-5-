public class Box implements Comparable {

    private double length, width, height;
    private int idNum;

    public Box ( double l , double w, double h){
        this.length = l;
        this.width = w;
        this.height = h;
        idNum = (int) (Math.random() * 9000) + 1000;
    }

    public double getVolume(){
        return length * width * height;
    }

    public boolean equals (Object o){

        Box b = (Box) o;
        return this.idNum == b.idNum;

    }

    public int compareTo(Object o) {
        Box b = (Box)o;
        if (this.equals(b))
            return 0;
        else
            return this.idNum - b.idNum;
    }

    public String toString(){
        return length + " x " + width + "x " + height + " Vol: " + getVolume() + "Id Num: " + idNum;
    }
}