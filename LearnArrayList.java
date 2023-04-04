import java.util.*;

public class LearnArrayList {

    public static void main(String[] args) {
        // This is how we create an arraylist.
        ArrayList<Integer> num = new ArrayList<>();
        // This is how we add element in an arraylist.
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        System.out.println(num);

        ArrayList<Integer> num3 = new ArrayList<>();
        num3 = (ArrayList)num.clone();

        System.out.println(num3);

        // This is how we add element to a particular index of an arraylist.
        num.add(1, 6);
        System.out.println(num);

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(8);
        num2.add(9);
        num2.add(10);

        // We use addAll method to add one list to another.
        num.addAll(num2);
        System.out.println(num);

        // This is how we retrieve an element using index.
        System.out.println(num.get(5));

        // This is how we remove element on a particular index.
        num.remove(3);
        System.out.println(num);

        // This is how we remove a particular element from the arraylist.
        num.remove(Integer.valueOf(5));
        System.out.println(num);

        // This is how we clear an arraylist
        // num.clear();
        // System.out.println(num);

        // This is how we set a value at a particular index.
        num.set(4, 40);
        System.out.println(num);

        // We use contains method to check if the value is present in the arraylist.
        boolean b = num.contains(7);
        System.out.println(b);

        // We use indexOf method to find the index of the given element.
        int ind = num.indexOf(9);
        System.out.println(ind);

        // We use size method to find the length of the arraylist.
        int size = num.size();
        System.out.println(size);

        // This is how we use for each loop.
        // element here is variable name.
        for (Integer element : num) {
            System.out.print(element + " ");
        }

        // This is another example how we can use for each loop.
        num.forEach(n -> System.out.print(n + " "));

        // This is iterator.
        // We can use this to iterate over an arraylist.
        Iterator<Integer> it = num.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }

}