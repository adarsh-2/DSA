import java.util.HashSet;

public class countDistinctElements2Array {
    
    public static void main(String[] args) {
        
        int arr1[] = {10,15,20,15,15,30,5};
        int arr2[] = {30,5,30,80};

        HashSet<Integer> HS = new HashSet<>();

        for(int i = 0; i<arr1.length; i++)
        {
            HS.add(arr1[i]);
        }

        int count = 0;
        for(int i = 0; i<arr2.length; i++){
            if(HS.contains(arr2[i])){
                count++;
                HS.remove(arr2[i]);
            }
        }

        System.out.println(count);

    }

}
