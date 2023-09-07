package Week4;
import java.util.*;


public class Map {
    public static void main(String[]args){
        HashMap<Integer,String>hm=new HashMap<>(java.util.Map.of(1,"A",2,"B",3,"C"));
        System.out.println(hm);

        HashMap hm1=new HashMap();
        hm1.put('c',1);
        hm1.put("A",2);
        hm1.put(3,1.23);
        hm1.put(4,1.23);
        hm1.put("A","c");
        System.out.println(hm1);
        System.out.println(hm1.containsKey(10));
        System.out.println(hm1.get(4));

        LinkedHashMap lhm=new LinkedHashMap ();
        lhm.put('c',1);
        lhm.put("A",2);
        lhm.put(3,1.23);
        lhm.put(4,1.23);
        lhm.put("A","c");
        System.out.println(lhm);

        TreeMap<String,Integer> t=new TreeMap<> ();
        t.put("A",1);
        t.put("x",20);
        t.put("C",3);
        t.put("Y",10);
        t.put("I",22);
        System.out.println(t);


        Set s=t.entrySet();
        Iterator i=s.iterator();
        while(i.hasNext()){
          Object o=(i.next());
          System.out.println(o);

        }
        MyComp mc=new MyComp();
        TreeMap<String,Integer> t1=new TreeMap<> (mc);
        t1.put("A",1);
        t1.put("x",20);
        t1.put("C",3);
        t1.put("Y",10);
        t1.put("I",22);
        System.out.println(t1);


    }
}
class  MyComp implements Comparator<String>{
    public int compare(String i1,String i2){

       return i2.compareTo(i1);
    }
}