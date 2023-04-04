// PS : You are given 2 strings s1 ans s2 you have to tell if s2 is the subsequence of s1.
// Subsequence if formed by removing characters from the string and maintaining the order of the remaining characters.

// This is iterative approach.

// TC : O(m+n)
// SC : O(1)

public class checkSubsequence
{

    static boolean check(String s1, String s2)
    {
        if(s2=="") return true;
        int l1 = s1.length();
        int l2 = s2.length();
        if(l2>l1) return false;
        boolean flag = true;
        int i = 0;
        int j = 0;
        while(i<l1 && j<l2)
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                i++;
                j++;
            }
            else
            i++;
        }
        if(j != l2)
        flag = false;

        return flag;
    }

    public static void main(String[] args)
    {
        String s1 = "abcd";
        String s2 = "abcd";
        boolean ans = check(s1, s2);
        System.out.println(ans);
    }
}
