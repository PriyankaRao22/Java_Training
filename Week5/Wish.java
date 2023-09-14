package Week5;
public class Wish {
    public synchronized  void greet(String name)
    {
  for(int i=0;i<=5;i++){
      System.out.print("Good morning:");
      try {
          Thread.sleep(1000);
      }
      catch(Exception e) {

      }
      System.out.println(name);

  }
  synchronized (this){
      for(int i=0;i<=5;i++){
          System.out.print("Good afternoon:");
          try {
              Thread.sleep(1000);
          }
          catch(Exception e) {
          }
          System.out.println(name);
      }
  }
    }
}
class NewThread extends Thread{
    Wish w1;
    String s;
    NewThread(Wish w,String name){
        this.w1=w;
        this.s=name;
    }
    public void run(){
        w1.greet(s);
    }
}
class Demo{
    public static void main(String[]args){
        Wish w=new Wish();
        NewThread d= new NewThread(w,"Priyanka");
        NewThread d1= new NewThread(w,"Rashi");
        d.start();
        d1.start();
    }
}


