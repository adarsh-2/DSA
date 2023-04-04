import java.util.*;

public class openChaining {

    public static int myHash(String data, int n) {
        return data.length() % n;
    }

    public static void insertData(LinkedList<String> arr[], String data) {
        int index = myHash(data, arr.length);
        arr[index].addFirst(data);
    }

    public static boolean searchData(LinkedList<String> arr[], String key) {
        int index = myHash(key, arr.length);
        Iterator<String> it = arr[index].iterator();
        while (it.hasNext()) {
            String data = it.next();
            if (data.equalsIgnoreCase(key)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<String> arr[] = new LinkedList[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new LinkedList<>();
        }

        arr[0].addFirst("Adarsh");
        arr[1].addFirst("Raj");
        arr[2].addFirst("Sonu");
        arr[3].addFirst("Om");
        arr[4].addFirst("Sanam");

        System.out.print("Enter data to be inserted : ");
        String s = sc.nextLine() ;
        insertData(arr, s);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
