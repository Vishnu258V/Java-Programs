package com.MAP;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

 

public class SortingHashMap {
    public static void main(String[] args) {
        MyComparator m=new MyComparator();
        Map<Integer,String > map=new TreeMap<>(m);
        map.put(5, "havi");
        map.put(1, "vishnu");
        map.put(2, "vishal");
        map.put(3, "kavya");
        map.put(4, "rohan");
        map.put(0, "shiv");
        map.put(6, "prathiba");
        System.out.println(map);
        
    } 
}
class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
    Integer i1 =(Integer)o1;
    Integer i2=(Integer)o2;
        return i2.compareTo(i1);
    }
}