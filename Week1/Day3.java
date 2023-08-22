package Week1;

import java.util.Scanner;

public class Day3 {
    public static void main(String[]args)
    {
        System.out.print("Enter a number: ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();

        if(a%2==0)
            System.out.println("number is even:"+ a);
        else
            System.out.println("number is odd:"+ a);


//  if else ladder

        System.out.print("Enter a number");
        int b=s.nextInt();
        if(b==1)
            System.out.println("Monday");
        else if(b==2)
            System.out.println("Tuesday");
        else if(b==3)
            System.out.println("WednesDay");
        else if(b==4)
            System.out.println("Thuesday");
        else if(b==5)
            System.out.println("Friday");
        else if(b==6)
            System.out.println("Saturday");
        else if(b==7)
            System.out.println("Sunday");
        else System.out.println("enter correct number");


        //Switch case
        int c=s.nextInt();
        switch (c){
            case 1:System.out.println("Monday");
                break;
            case 2:System.out.println("Tuesday");
                break;
            case 3:System.out.println("Wednesday");
                break;
            case 4:System.out.println("Thuesday");
                break;
            case 5:System.out.println("Friday");
                break;
            case 6:System.out.println("Saturday");
                break;
            case 7:System.out.println("Sunday");
                break;
            default:System.out.println("Invalid day");
                break;

        }
    }
}
