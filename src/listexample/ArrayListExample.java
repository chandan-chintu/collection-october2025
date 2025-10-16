package listexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // wrapper class
//        int a=10;
//        int b=null; - this is no allowed
//        Integer c= null;

        // declare
        List<Integer> list1 = new ArrayList<>();

        // add the data
        list1.add(23);
        list1.add(12);
        list1.add(66);
        list1.add(45);
        list1.add(10);
        list1.add(12);
        list1.add(7);
       // list1.add(null);
        list1.add(2);
        //list1.add(null);

        System.out.println("list1 is : "+list1);

        // remove data
        list1.remove(4);
        System.out.println("list1 after removing 4th index : "+list1);

        // search
        System.out.println("5th index data of list1 : "+list1.get(5));
        System.out.println("6th index data of list1 : "+list1.get(6));

        //size
        System.out.println("length of list1 : "+list1.size());

        //sort
        Collections.sort(list1);
        System.out.println("sorted list1 is :"+list1);

        // traverse
        System.out.println("traversing using foreach loop");
        for(Integer l1 : list1){
            System.out.println(l1);
        }
    }
}
