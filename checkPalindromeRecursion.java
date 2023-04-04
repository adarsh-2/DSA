// Write a recursive function to check if the string is palindrome or not

public class checkPalindromeRecursion
{
    static boolean check(String s, int start, int end)
    {
        if(start >= end)
        return true;

        // if(s.charAt(end)==s.charAt(start))
        // {
        //     return check(s, start+1, end-1);
        // }
        // else
        // return false;

        return (s.charAt(end)==s.charAt(start)) && check(s,start+1,end-1);
        
    }

    public static void main(String[] args) {
        System.out.println(check("aba", 0, 2));
    }
}
