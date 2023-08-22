package Week2;

public class Overriding {
    public static void main(String []args){
     StudentInfo si= new StudentInfo();
     si.average(10,20,30);

     Derived d =new Derived();
     d.grade(80);

     StudentInfo si1=new Derived();
     si1.average(30,40,50);
     si1.grade(90);

    }

}
class StudentInfo{
    public void average(int x,int y,int z){
        System.out.println("Averageof total Marks is:"+(x+y+z)/3);
    }
    public void grade(int marks){
        if(marks>=90)
            System.out.println("grade is "+"A");
        else if(marks<90 & marks>=80)
            System.out.println("grade is "+"B");
        else if(marks<80 & marks>=70)
            System.out.println("grade is "+"C");
    }
}
class Derived extends  StudentInfo{
    public void average(int x,int y,int z){
        System.out.println(" Average  Marks is:"+(x+y+z)/3);
    }
    public void grade(int marks){
        if(marks>=90)
            System.out.println("grade according to marks is "+"A");
        else if(marks<90 & marks>=80)
            System.out.println("grade according to marks  is:"+"B");
        else if(marks<80 & marks>=70)
            System.out.println("grade according to marks is: "+"C");
        else
            System.out.println("grade according to marks is: "+"D");
    }
}


