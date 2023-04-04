// Print 1 to N using recursion

public class print1toN
{
    // This function is non - tail recursive
    static void print(int n)
    {
        if(n==0)
        return;

        print(n-1);
        System.out.print(n + " ");
    }

    // This is the equivalent tail recursive code
    static void print2(int n,int k)
    {
        if(n==0)
        return;

        System.out.print(k + " ");
        print2(n-1, k+1);
    }

    public static void main(String[] args)
    {
        print(7);
        System.out.println();
        print2(5,1);
    }
}