package Week5;


public class Deadlock {
    public static void main(String[]args)throws InterruptedException{
           Calculation c=new Calculation();
           MyThread3 m3=new MyThread3(c);
           m3.start();
           synchronized (c){
               c.wait();
             //  c.wait(1000);
           }
        System.out.println("deadlock");
    }
}

class Calculation{
    int total;
}
class MyThread3 extends Thread{
    Calculation c1;
    MyThread3 (Calculation c){
        this.c1=c;
    }
    public void run(){
        for(int i=1;i<=50;i++){
            c1.total=c1.total+i;
        }
        synchronized (c1){
            c1.notify();
        }
     System.out.println(c1.total);
    }

}
