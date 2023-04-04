import java.util.ArrayList;

public class RemoveDuplicate{

    public static void main(String[] args) {
        
            int arr[] = {2,2,2,3,4,5,6,6,6,7};
            int l = arr.length;
            // int temp[] = new int[l];
            ArrayList<Integer> ans = new ArrayList<>();
            // int i = 0;
            for(int j = 0;j<l-1;j++){
                if(arr[j]!=arr[j+1]){
                    ans.add(arr[j]);
                    // i++;
                }
            }
            // temp[i++] = arr[l-1];
            ans.add(arr[l-1]);

            System.out.println(ans.size());

    }

}




