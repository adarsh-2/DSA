import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        HashMap<String, String> sd = new HashMap<>();
        HashMap<String, String> reverse = new HashMap<>();

        sd.put("Chennai", "Banglore");
        sd.put("Mumbai", "Delhi");
        sd.put("Goa", "Chennai");
        sd.put("Delhi", "Goa");
        int n = sd.size();

        for (Map.Entry<String, String> a : sd.entrySet()) {
            reverse.put(a.getValue(), a.getKey());
        }
        String start = null;

        for (Map.Entry<String, String> a : sd.entrySet()) {
            if (!reverse.containsKey(a.getKey()))
                ;
            start = a.getKey();
            break;
        }

        while (start != null) {
            System.out.println(start + "->" + sd.get(start));
            start = sd.get(start);
        }

    }

}
