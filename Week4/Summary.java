package Week4;

import java.util.ArrayList;

public class Summary {
    public static void main(String[]args){
        ArrayList<Integer> al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        int sum=0;
        for(int i=0;i<al.size();i++)
        {
            sum=sum+al.get(i);
        }
        System.out.println(sum);

    }
}
