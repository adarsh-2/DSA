public class missingno {

    public static void main(String[] args) {
        int arr[] = {1,4,7,3,2,6};
        int max = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max)
            max = arr[i];
        }

        int ss = max * (max + 1)/2;

        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            sum = sum + arr[i];
        }

        System.out.println(ss -sum);
    }
    
}
