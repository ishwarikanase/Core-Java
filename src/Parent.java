/**
 * Created by raj on 18/8/18.
 */
public class Parent {
    int i;
    Parent(int a){
        i=a;
    }
    void displayP(){
        System.out.println(i);
    }
}
class Child extends Parent{
    int j;
    Child(int a,int b){
        super(a);
        j=b;
    }
    void displayC(){
        System.out.println(j);
    }

    public static void main(String[] args) {
        Child obj=new Child(5,10);
        obj.displayP();
        obj.displayC();
    }
}
