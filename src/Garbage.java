/**
 * Created by raj on 18/8/18.
 */
public class Garbage {
    int length,breadth;
    Garbage(){
        length=0;
        breadth=0;
        System.out.println("Default Constructor");
    }
    Garbage(int length,int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Parameterized Constructor");
    }
    protected void finalized() {
        System.out.println("Object Destroyed");
    }

    public static void main(String[] args) {
        Garbage obj1=new Garbage();
        obj1=null;
        Garbage obj2=new Garbage(10,20);
        obj2=null;
        System.out.println(obj1.breadth);
        System.out.println(obj2.breadth);

    }
}

