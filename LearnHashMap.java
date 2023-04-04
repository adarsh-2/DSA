import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearnHashMap {

    public static void main(String[] args) {

        // This is how we create hashmap.
        HashMap<String, Integer> myHashMap = new HashMap<>();

        // s1.contains(s1);

        // Inserting key-value pair in hashmap.
        myHashMap.put("India", 138);
        myHashMap.put("China", 143);
        myHashMap.put("USA", 33);
        myHashMap.put("Indonesia", 27);
        myHashMap.put("Pakistan", 22);

        // this will display the size of the hashmap
        System.out.println(myHashMap.size());

        // Hashmap store unordered pairs, which means that it is not necessary that you
        // will get output in the order that you have inserted.
        System.out.println(myHashMap);

        // This is how we update the value of a key in hashmap.
        myHashMap.put("China", 144);

        System.out.println(myHashMap);

        // We use containsKey method to check if the key is present in the hashmap.
        System.out.println(myHashMap.containsKey("USA"));

        // We use containsValue method to check if the value is present in the hashmap.
        System.out.println("value "+myHashMap.containsValue(27));

        // get method is used to get the value corresponding to a key.
        System.out.println(myHashMap.get("Indonesia"));

        // If the key is not present null will be printed.
        System.out.println(myHashMap.get("Russia")  );

        for (Map.Entry<String, Integer> e : myHashMap.entrySet()) {
            System.out.print(e.getKey());
            System.out.print(e.getValue());
            System.out.println("");
        }

        System.out.println("---------------------------------------");

        Set<String> keys = myHashMap.keySet();
        for (String key : keys) {
            System.out.println(key + " " + myHashMap.get(key));
        }

        // remove method is used to remove the whole key-value pair using the key.
        // remove function return the value corresponding to the key.
        // if key is not present in the map then it return null.
        // myHashMap.remove("China");
        System.out.println(myHashMap.remove("China"));

        System.out.println(myHashMap);

        

    }

}

// put containsKey remove are O(1) on average because they use hashing
// get is also O(1)
// size and isEmpty are O(1) even in worst case 