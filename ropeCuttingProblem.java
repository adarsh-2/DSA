// You are given a length of rope n and 3 lengths a b and c 
// You have to cut the rope in maximum no of pieces such that length of each piece is either a or b or c
// return the maximum no of pieces that are possible to make

public class ropeCuttingProblem
{
    static int horse(int n, int a, int b, int c)
    {
        if(n<0)
        return -1;

        if(n==0)
        return 0;

        int res = Math.max(horse(n-a, a, b, c),Math.max(horse(n-b, a, b, c),horse(n-c, a, b, c)));

        if(res == -1)
        return -1;

        return res + 1;
    }

    public static void main(String[] args)
    {
        int ans = horse(12, 2, 3, 5);
        System.out.println(ans);
    }
}