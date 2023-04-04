// HashSet is used to store the keys.

import java.util.*;

public class LearnHashSet {

    public static void main(String[] args) {

        // We can specify the initial capacity of the HashSet in the circular brackets;
        HashSet<Integer> myHashSet = new HashSet<>();

        myHashSet.add(5);
        myHashSet.add(8);
        myHashSet.add(7);
        myHashSet.add(11);
        // add function will return false if the item is already present and will ignore the add command
        myHashSet.add(7);

        System.out.println(myHashSet);

        System.out.println(myHashSet.contains(5));

        Iterator<Integer> i = myHashSet.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        System.out.println(myHashSet.size());

        myHashSet.remove(8);

        System.out.println(myHashSet.size());

        for(Integer j : myHashSet)
        {
            System.out.println(j);
        }

        System.out.println(myHashSet.isEmpty());

        myHashSet.clear();

        System.out.println(myHashSet.isEmpty());

    }

}
