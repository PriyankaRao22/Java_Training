package Week3;

import java.util.Scanner;

public class Summary  {

    public static void main(String[]args){
        Scanner s =new Scanner(System.in);
        int x=s.nextInt();

        Circle c= new Circle();
        c.areaOfCircle(x);
        c.circumfOfCircle(x);
        c.display();
    }

}

class CircleInfo{
    public void areaOfCircle( int r){
        System.out.println("calculating area of circle");
    }
    public void circumfrenceOfCircle( int r){
        System.out.println("calculating cicumfrence of circle");
    }
    public void display(){
        System.out.println("Area of circle is x and circumfrence of circle is y");
    }
}
class Circle extends CircleInfo{
    static final double pi=3.14;
     static double  area=0;
     static double circumfrence=0;
    public  void areaOfCircle(int r){

        try {
            if (r < 0) {
                throw new NegativeRadiusException();
            }
                else {
                 area = pi * r * r;
            }
            }
        catch(NegativeRadiusException n){
            System.out.println(n);
        }
      System.out.println("area = "+area);
    }
    public  void circumfOfCircle(int r){

        try {
            if (r < 0) {
                throw new NegativeRadiusException();
            }
            else {
                circumfrence = 2*pi *r;
            }
        }
        catch(NegativeRadiusException n){
            System.out.println(n);
        }
        System.out.println("circumfrence= "+ circumfrence);
    }

    public void display(){
        System.out.println("Area of circle is : "+area+ " and" +
                " circumfrence of circle is: "+circumfrence);

    }
}


class NegativeRadiusException extends  Exception{
    public String toString(){
        return"radius of circle can not be negative";
    }
}
