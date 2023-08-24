package Week2;

public class Summary {

    public static void main(String[]args) {
        Base b = new Base();
        b.print();
        b.sum(10,20);
        b.greet("priyanka");

        Derived1 d=new Derived1();
        d.print();
        d.sum(10,20,30);
        d.sum(10,20);
        d.greet("Rashi");

        Base b1=new Derived1();
        b1.print();
        b1.sum(40,50);
        b1.greet("Priya");
    }
}

 class Base{
    public void print(){
        System.out.println("Hello world");
    }
    public void sum(int x, int y)
    {
        System.out.println("sum of two numbers :"+(x+y));
    }
    public void greet(String s){
        System.out.println("Goog Morning:"+s);
    }

 }
 class Derived1 extends Base
 {
     public void sum(int x, int y,int z)
     {
         System.out.println("sum of three numbers :"+(x+y+z));
     }
     public void greet(String s){
         System.out.println("Goog Afternoon:"+s);
     }

 }