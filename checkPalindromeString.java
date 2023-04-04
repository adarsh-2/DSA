import java.util.Scanner;
import java.util.*;

public class checkPalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a[] = new char[s.length()];
        for(int i =0 ; i<s.length();i++){
            a[i] = s.charAt(i);
        }
        
        char ns[] = new char[s.length()];
        for(int i =0 ; i< s.length(); i++){
            ns[i] = a[s.length() - i - 1];
        }
        boolean flag = true;
        for(int i = 0;i<s.length();i++){
            if(a[i]!=ns[i])
            flag= false;
        }
        System.out.println(flag);
    }
}
