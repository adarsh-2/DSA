import java.util.*;

public class firstUniqueCharacterInString {

    public static void main(String[] args) {

        String s = "abcdebadf";

        int a = s.length();

        ArrayList<Character> al = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            if (al.contains(s.charAt(i)) == false) {
                al.add(s.charAt(i));
            } else {
                al.remove(Character.valueOf(s.charAt(i)));
            }
        }
        System.out.println(al.get(0));

    }

}
