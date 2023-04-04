public class subsetsWithGivenSum
{
    static int number(int[] arr, int k, int n)
    {
        if(n==0)
        return (k == 0)?1:0; // If the condition is true it will return 1 else 0

        return number(arr,k,n-1) + number(arr,k - arr[n-1], n-1);
    }

    public static void main(String[] args)
    {
        int[] arr = {10,20,30};
        int ans = number(arr,30,3);
        System.out.println(ans);
    }
}
