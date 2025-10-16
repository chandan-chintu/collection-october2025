package mapexample;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        Map<Integer,String> map1 = new TreeMap<>();

        map1.put(107,"Guava");
        map1.put(105,"Apple");
        map1.put(103, "Mango");
        map1.put(101,null);
        map1.put(104,"Grapes");
        map1.put(104,"Pineapple");// old value gets removed and new value gets added
        map1.put(106,"Grapes");
        map1.put(110,null);

        System.out.println("map1 is : "+map1);

        map1.remove(110);
        System.out.println("map1 after remove : "+map1);

        System.out.println("traversing using foreach");
        for(Map.Entry m1 : map1.entrySet()){
            System.out.println(m1.getKey()+"------"+m1.getValue());
        }
    }
}
