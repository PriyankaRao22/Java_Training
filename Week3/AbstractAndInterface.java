package Week3;

public class AbstractAndInterface extends Abstract implements Interface{
    public void display(){
        System.out.println("Overriding of display method");
    }

    public void sum(int a, int b){
        System.out.println("Sum of two number is:"+(a+b));
    }
    public  void info(){
        System.out.println("overriding of info method");
    }
    public static void main(String[]args){
        Abstract a=new AbstractAndInterface();
        a.display();
        a.print();
        a.sum(20,80);
        Interface i=new AbstractAndInterface();
        i.display();
        i.info();
    }

}
abstract  class Abstract{
    abstract public void display();
    abstract public void sum(int a, int b);
    public void print(){
        System.out.println("this is abstract class method");
    }
}

interface  Interface{
    void info();
    void display();

}