public class factorialTailRecursion
{
    
    static int fact(int n, int k)
    {
        if(n==1)
        return k;

        return fact(n-1,n*k);
    }

    public static void main(String[] args)
    {
        int ans = fact(5,1);
        System.out.println(ans);
    }

}