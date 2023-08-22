package Week2;

import java.util.Scanner;

public class Student {
    String name;
    int age;
    int rollNo;
    static int m1,m2,m3;
    public void StudentInfo(String name, int age, int rollNo){
        System.out.println("Name of Student is "+name +
                ",age is "+ age+ " and rollNo is:"+rollNo);
    }
    public void avergeMarks(int m1,int m2,int m3){
        System.out.println("Average Marks of Student is:"+ (m1+m2+m3)/3);

    }

    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter marks of Student:");
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();

        Student s1= new Student();
        s1.StudentInfo("priyanka",20,101);
        s1.avergeMarks(m1,m2,m3);
    }
}
