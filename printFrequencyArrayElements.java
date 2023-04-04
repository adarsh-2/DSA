import java.util.*;

public class printFrequencyArrayElements {

    static HashMap freq(int[] arr) {
        HashMap<Integer, Integer> HM = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (HM.containsKey(arr[i]) == false) {
                HM.put(arr[i], 1);
            } else {
                HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
            }
        }
        return HM;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 12, 10, 15, 10, 12, 20, 12 };
        HashMap<Integer, Integer> ans = freq(arr);
        System.out.println(ans);

    }
}
