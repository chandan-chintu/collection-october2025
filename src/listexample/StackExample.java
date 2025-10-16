package listexample;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> stc1 = new Stack<>();

        // push
        stc1.push("ABC");
        stc1.push(null);
        stc1.push("poo");
        stc1.push("gt6yun");
        stc1.push("ABC");

        System.out.println("stc1 is : "+stc1);

        // pop
        stc1.pop();
        stc1.pop();
        System.out.println("stc1 after 2 pop : "+stc1);

        for(String s1 : stc1){
            System.out.println(s1);
        }
    }
}
