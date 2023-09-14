package Week5;

public class MyThread extends Thread {
    public void run() {
        System.out.println("This is my thread");
    }

}
class MyThread2 implements Runnable{
    public void run() {
        System.out.println("This is my thread 1");
    }

}
class Main{
    public static void main(String []args){

        MyThread mt =new MyThread();

        MyThread2 mt1 =new MyThread2();
        Thread t=new Thread(mt1);
        t.start();
        for(int i=1;i<3;i++)

        {
            System.out.println("main thread");
        }
        mt.start();
    }

}

