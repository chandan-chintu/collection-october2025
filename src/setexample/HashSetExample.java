package setexample;


import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();

        set1.add("Guava");
        set1.add("Mango");
        set1.add("Grapes");
        set1.add("Apple");
        set1.add("Watermelon");
        set1.add(null);
        set1.add("Guava");
        set1.add(null);

        System.out.println("set1 is : "+set1);

        Set<Object> set2 = new HashSet<>();
        set2.add(123);
        set2.add("Apple");
        set2.add(true);
        set2.add(23.45);
        set2.add(22.22f);
        System.out.println("set2 is : "+set2);

        set1.remove(null);
        set1.remove("Grapes");

        System.out.println("set1 after removing : "+set1);

        System.out.println("traverse using foreach:");
        for(String s1 : set1){
            System.out.println(s1);
        }
    }
}
