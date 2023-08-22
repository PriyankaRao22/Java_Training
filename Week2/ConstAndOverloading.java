package Week2;

public class ConstAndOverloading {
    public ConstAndOverloading(int a)
    {
        System.out.println("constructor with one argument");
    }
    public ConstAndOverloading(int a, float b)
    {
        System.out.println("constructor with two argument");
    }
    public ConstAndOverloading(int a, float b ,char c)
    {
        System.out.println("constructor with three argument");
    }

    public static void print(int a){
        System.out.println("method with one argument");
    }
    public static void print (int a, int b){
        System.out.println("method with two argument");
    }

    public static void main(String[] args){
        ConstAndOverloading co=new ConstAndOverloading(5);
        ConstAndOverloading co1=new ConstAndOverloading(5,2.0f);
        ConstAndOverloading co2=new ConstAndOverloading(2,3.0f,'a');
        co.print(1);
        co.print(1,2);

    }
}
