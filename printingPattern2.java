// 1
// 1 2
// 1 2 3

public class printingPattern2
{

    public static void main(String[] args) {
        
        for(int i = 1; i<=3; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }   

}
