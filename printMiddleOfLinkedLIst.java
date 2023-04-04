import java.util.LinkedList;

public class printMiddleOfLinkedLIst {

    public static void main(String[] args) {
        
        LinkedList<String> LL = new LinkedList<>();
        
        LL.add("Adarsh");
        LL.add("Aniket");
        LL.add("Pavan");
        LL.add("Sarthak");
        LL.add("Shivan");
        LL.add("Shaurya");
        LL.add("Zebra");
        LL.add("Harish");

        int size = LL.size();

        System.out.println(LL.get(size/2));

    }
    
}
