package Week4;
import java.util.*;

public class ListAndSet {
   public static void main(String[]args){
       ArrayList al=new ArrayList();
       al.add(10);
       al.add(20);
       al.add(30);
       al.add(40);
       al.add(50);


       ArrayList al1=new ArrayList(3);
       al1.add(100);
       al1.add(200);
       al1.add(300);
       al1.add(400);
       al1.add(500);

       System.out.println(al);
       System.out.println(al1);

       al.add(1,5);
       al.addAll(al1);
       System.out.println(al);

       al.addAll(0,al1);

       System.out.println(al);

       ArrayList al2=new ArrayList(List.of(1,2,3,4,5,2));
       System.out.println(al2);
       System.out.println(al2.contains(3));
       System.out.println(al2.indexOf(2));
       System.out.println(al2.lastIndexOf(2));

       LinkedList l=new LinkedList();
       l.add(10);
       l.add(20);
       l.add(30);
       l.add(40);
       l.add(50);
       l.addFirst(1);
       l.addLast(10);

       System.out.println(l);
       LinkedList l1=new LinkedList(List.of(1,2,3,4,5));
       System.out.println(l1);

       ListIterator li=l1.listIterator() ;
       while(li.hasNext())
       {
           Integer i=(Integer)li.next();
           if(i%2==0){
               System.out.println(i);
           }
       }
       while(li.hasPrevious())
       {
           Integer i = (Integer)li.previous();
           if (i % 2 == 0) {
               System.out.println(i);
               li.set(0);
               System.out.println(l1);
                          }
       }

       //Set
       HashSet hs=new HashSet();
       hs.add(2);
       hs.add(40);
       hs.add(100);
       hs.add(4);
       hs.add(5);
       hs.add(6);
       hs.add(7);
      System.out.println( hs.add(4));
       System.out.println(hs);

       LinkedHashSet hs1 =new LinkedHashSet();
       hs1.add("A");
       hs1.add("B");
       hs1.add("k");
       hs1.add("C");
       hs1.add("I");
       hs1.add("D");
       hs1.add("O");
       hs1.add("Z");
       hs1.add("J");
       System.out.println( hs1.add("A"));
       System.out.println(hs1);

       Iterator i=hs1.iterator();
       while(i.hasNext()){
           String s=(String)(i.next());
           System.out.println(s);
       }


       //TreeSet


       MyCom mc =new MyCom();

       TreeSet s1=new TreeSet(Set.of(2,4,8,1,5,10,32));
       System.out.println(s1);

       TreeSet s=new TreeSet(mc);
       s.add(10);
       s.add(1);
       s.add(8);
       s.add(20);
       s.add(15);
       System.out.println(s);

   }
}


class  MyCom implements Comparator{
    public int compare(Object o1,Object o2){
       Integer i1=(Integer) o1;
        Integer i2=(Integer) o2;
        if(i1>i2)
            return -1;
        else if(i2>i1)
            return 1;
        else
            return 0;
    }
}
