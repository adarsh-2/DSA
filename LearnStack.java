import java.util.*;

public class LearnStack {

    public static void main(String[] args) {
        
        // This is how we declare a stack.
        Stack<Integer> s1 = new Stack<>();
        // This is how we push elements in stack.
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        System.out.println(s1);
        System.out.println(s1.size());

        // We use search method to find the position of the element present in the stack.
        // Indexing starts from top of stack with starting value 1.
        int g = s1.search(2);
        System.out.println(g);

        // We use empty method to check if the stack is empty.
        boolean a = s1.empty();
        System.out.println(a);

        // We use peek method to find element at the top of the stack.
        int b = s1.peek();
        System.out.println(b);

        // We use pop method to remove the top element of the stack.
        s1.pop();
        System.out.println(s1);

        // We use search method to check if the value
        int c = s1.search(4);
        System.out.println(c);

        // We use indexOf method to find out index of the element present.
        int d = s1.indexOf(4);
        System.out.println(d);

        // int ex = 5;
        // + is a part of println
        // To use format specifier we use ,
        // System.out.printf("%d" , ex);

        // System.out.printf("HELLO");

        // System.out.println();
        // System is a class. out is a static method. println is method.

    }

}


// Underflow : It happens when we call peek() or pop() operation on empty stack.

// Overflow : It happens when we push something on a full stack.