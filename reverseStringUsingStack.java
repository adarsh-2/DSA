import java.util.Stack;

public class reverseStringUsingStack {

    static String rev(String a){

        Stack<Character> st = new Stack<>();
        int l = a.length();
        for(int i = 0; i<l; i++){
            st.push(a.charAt(i));
        }
        String ans = " ";
        for(int j = 0; j<l ; j++){
            ans = ans + st.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(rev("adarsh"));
    }
    
}
