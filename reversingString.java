import java.util.*;

public class reversingString {

    public static void main(String[] args) {
        String s = "adarsh";
        int n = s.length();
        char arr[] = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i);
        }
        for (int j = n - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }
}
