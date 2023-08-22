package Week1;

import java.util.Scanner;

public class SummaryDay5 {
    static int evensum;
    static int oddsum;

    public static void main(String[] args) {
        int a=10;
        int b=20;
        Scanner s=new Scanner(System.in);
        System.out.print("enter a value:");
        int x=s.nextInt();
        switch (x){
            case 1:System.out.println(a+b);
                break;
            case 2:System.out.println(a-b);
                break;
            case 3:System.out.println(a*b);
                break;
            case 4:System.out.println(a/b);
                break;
            case 5:System.out.println(a%b);
                break;
            default:System.out.println("Enter correct value for doing operation");
        }

        //sum of all even and odd digit from 1 to 100;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evensum = i + evensum;
            } else
                oddsum = i + oddsum;
        }
        System.out.println(evensum);
        System.out.println(oddsum);



    }
}
