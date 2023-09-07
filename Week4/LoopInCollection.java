package Week4;

import java.util.ArrayList;

public class LoopInCollection {
    public static void main(String[]args){
        ArrayList al=new ArrayList();
        al.add(10);
        al.add("A");
        al.add('c');
        al.add(20);
        al.add(1.2);
        System.out.println(al);

        System.out.println("using for each loop");
        for(Object o:al)
        {
            System.out.println(o);
        }
        System.out.println("using for loop");
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }

    }

}
