 package dsa;

// import java.util.Collections;
// import java.util.Stack;

// public class Stackss {
//     public static void main(String[] args) {
//         Stack<Integer> s= new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         System.out.println(s);
//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//         //  System.out.println(s);
         
//          Collections.reverse(s);
//          System.out.println(s);
//     }
    
// }

import java.util.Stack;

public class Stackss {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int x = 0;

        Stack<Integer> temp = new Stack<>();

        // Move all elements to temp
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }

        // Push at bottom
        stack.push(x);

        // Push back all elements
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        System.out.println(stack);
    }
}
