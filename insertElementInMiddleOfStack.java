import java.util.Stack;

public class insertElementInMiddleOfStack {

    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        stack1.push(7);
        stack1.push(8);
        stack1.push(9);
        int a = 3;
        int pos = 5;
        int size = stack1.size();

        int l = size - pos + 1;
        int arr[] = new int[l];

        for (int i = 0; i < l; i++) {
            arr[i] = stack1.pop();
        }

        stack1.push(a);

        for (int j = l - 1; j >= 0; j--) {
            stack1.push(arr[j]);
        }

        System.out.println(stack1);
    }

}
