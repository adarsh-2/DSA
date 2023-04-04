// You are given a string ABC you have to print all the permutations where "AB" is not a substring

public class permutationsWithoutAB
{
    static boolean check(String s, int i)
    {
        if(s.indexOf("AB")==-1)
        return true;

        return false;
    }

    static String swap(String s, int i, int j)
    {
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }

    static void print(String s, int i)
    {
        if(i == s.length() - 1)
        {
            if(check(s, i))
            System.out.println(s);
            return;
        }
        
        for(int j = i; j<s.length(); j++)
        {
            s = swap(s, i, j);
            print(s, i+1);
            s = swap(s, i, j);
        }
    }

    public static void main(String[] args)
    {
        String s = "ABC";
        print(s, 0);   
    }
}
