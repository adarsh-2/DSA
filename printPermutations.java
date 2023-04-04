public class printPermutations
{
    static String swap(String s, int i, int j)
    {
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }

    static void pikachu(String s, int i)
    {
        if(i==s.length()-1)
        System.out.println(s);
        else
        {
            for(int j = i; j<=s.length()-1; j++)
            {
                s = swap(s,i,j);
                pikachu(s,i+1);
                s = swap(s,i,j);
            }
        }
    }

    public static void main(String[] args)
    {
        String s = "ABC";
        pikachu(s, 0);
    }
}
