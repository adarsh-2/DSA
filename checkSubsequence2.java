// This is recursive approach

public class checkSubsequence2
{

    static boolean check(String s1, String s2, int l1, int l2)
    {
        if(l2==0) return true;
        if(l1==0) return false;
        if(l2>l1) return false;
        if(s1.charAt(l1 - 1) == s2.charAt(l2-1))
        check(s1,s2,l1-1, l2-1);
        else
        check(s1, s2, l1-1, l2);
    }
    
    public static void main(String[] args)
    {
        String s1 = "abcd";
        String s2 = "ad";
        int l1 = s1.length();
        int l2 = s2.length();
        boolean ans = check(s1, s2, l1, l2);
        System.out.println(ans);
        
    }
}
