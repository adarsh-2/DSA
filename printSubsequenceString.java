// You are given a string s you have to print all the subsequence of the string

import java.util.ArrayList;

public class printSubsequenceString
{

    static void print(String s, String curr, int i, ArrayList arr)
    {
        if(i==s.length())
        {
            arr.add(curr);
            return ;
        }

        print(s,curr + s.charAt(i), i+1,arr);
        print(s,curr , i+1,arr);
    }

    public static void main(String[] args)
    {
        ArrayList<String> ans = new ArrayList<>();
        print("ABC","",0,ans);
        System.out.println(ans);
    }
    
}   