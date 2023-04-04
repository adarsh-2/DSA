// import java.util.HashMap;
import java.util.Arrays;
import java.util.HashSet;

public class countDistinctElement
{

    static int count(Integer arr[])
    {
        HashSet<Integer> HS = new HashSet<>(Arrays.asList(arr)); 
        return HS.size();
    }

    public static void main(String[] args)
    {
        Integer[] arr = {10,11,12};

        Integer a = count(arr);
        System.out.println(a);

        // HashSet<Integer> HM = new HashSet<>();
        // for(int i = 0; i<arr.length; i++)
        // {
        //     HM.add(arr[i]);
        // }
        // System.out.println(HM);
        // System.out.println(HM.size());
    }
}
