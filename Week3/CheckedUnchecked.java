package Week3;

import java.util.Scanner;

public class CheckedUnchecked
{
    public static  void meth1(int x,int age) throws  ArrayIndexOutOfBoundsException
    {
        try
        {
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator not be zero");
        }
        try
        {
            if(x>10000)
            throw new InufficientAmount();
        }
        catch (InufficientAmount e)
        {
            System.out.println(e);
        }

           try {
               if (age < 18)
                   throw new TooYoungException();
               else if (age > 50)
                   throw new TooOldException();
           }
           catch(TooOldException |TooYoungException e)
           {
               System.out.println(e);
           }


        try
        {
            int arr[]={1,2,3};
            System.out.println(arr[4]);
        }
        catch(NullPointerException e)
        {

        }

    }

    public static void main(String[]args) throws ArrayIndexOutOfBoundsException
    {
        Scanner s=new Scanner(System.in);
        int y=s.nextInt();
          meth1(10001,y);
    }
}

class InufficientAmount extends Exception
{
    public String toString()
    {
        return "Insufficient money in your account";
    }
}
class TooYoungException extends RuntimeException{
    public String toString()
    {
        return "your age is too less";
    }
}
class TooOldException extends RuntimeException{
    public String toString()
    {
        return "your age is more then required age";
    }
}