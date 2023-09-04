package Week4;

import java.util.ArrayList;

public class Generic {
    public static void main(String[]args){


        ArrayList<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(5);
        a.add(10);
       // a.add("hello");  not acceptable;
        System.out.println(a);


        Demo d=new Demo();
        d.setAdd(1);
        System.out.println(d.getAdd());
        d.setAdd("Hi");
        System.out.println(d.getAdd());

        Demo <Integer>d1=new Demo<>();
        d1.setAdd(1);
        System.out.println(d1.getAdd());

//        d1.setAdd("Hi");
//        System.out.println(d1.getAdd());


        MyArray ma=new MyArray();
        ma.add("hy");
        ma.add(2);
        ma.add('c');
        ma.display();
    }
}

class Demo<T>
{
    private T add;
    public void setAdd(T a){
        add=a;
    }
    public T getAdd(){
        return add;

    }
}

class MyArray<T>{
    T[]arr=(T[])new Object[10];
    int length=0;
    public void add(T t){
        arr[length]=t;
        length++;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.print(arr[i] +" ");

        }
    }
}

