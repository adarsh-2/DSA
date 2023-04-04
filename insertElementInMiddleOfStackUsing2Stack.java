import java.util.*;

public class insertElementInMiddleOfStackUsing2Stack {

    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        stack1.push(7);
        stack1.push(8);
        stack1.push(9);
        int a = 3;
        int pos = 4;
        int size = stack1.size();
        int l = size - pos + 1;
        for (int i = 0; i < l; i++) {
            stack2.push(stack1.pop());
        }
        stack1.push(a);
        for (int i = 0; i < l; i++) {
            stack1.push(stack2.pop());
        }
        System.out.println(stack1);

    }

}