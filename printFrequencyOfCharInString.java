public class printFrequencyOfCharInString
{
    public static void main(String[] args)
    {
        String S = "geeksforgeeks";
        int[] arr = new int[26];
        for(int i = 0; i<S.length(); i++)
        {
            // int ind = (int)(S.charAt(i)-97); // This is also correct
            int ind = S.charAt(i)-'a'; // This is also correct
            arr[ind]++;
        }
        for(int i = 0; i<26; i++)
        {
            if(arr[i]>0)
            {
                // System.out.println((char)(i + 97) + " " + arr[i]); // This is also correct
                System.out.println((char)(i + 'a') + " " + arr[i]); // This is also correct
            }
        }
    }
}
