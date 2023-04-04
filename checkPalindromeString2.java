// 

import java.util.Scanner;

public class checkPalindromeString2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int low = 0;
        int high = s.length()-1;
        boolean flag = true;
        while(low<high)
        {
            if(s.charAt(high) != s.charAt(low))
            {
                flag = false;
                break;
            }
            low++;
            high--;
        }
        System.out.println(flag);
    }
}