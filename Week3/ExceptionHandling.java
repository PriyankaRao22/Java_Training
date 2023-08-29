package Week3;

public class ExceptionHandling {
    static String s;
    public static void math1() {
        try {
            try
            {
                System.out.println(10 / 0);
                System.out.println("Hello");
            }
            catch (ArithmeticException e)
            {
                System.out.println("Handling arithmetic exception");
            }
            finally
            {
                System.out.println("execution of inner finally block");
            }

            System.out.println(s.length());

        }
        catch (NullPointerException n)
        {
            System.out.println("Handling Nullpointer exception");
        }
        catch (Exception e)
        {
            System.out.println("handling exceptions");
        }
        finally
        {
            System.out.println("execution of outer  finally block");
        }
        try
        {
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println(arr[5]);
        }
        finally
        {
            System.out.println("finally without catch");
        }
    }
        public static  void display()
        {
            math1();
    }
    public static void main(String[]args)
    {
        display();
    }
}
