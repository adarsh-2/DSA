// Print N to 1 using recursion

public class printNto1
{
    static void print(int n)
    {
        if(n==0)
        return;

        System.out.print(n + " ");
        print(n-1);
    }

    public static void main(String[] args)
    {
        print(7);
    }
}
 