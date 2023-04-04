
public class checkingVowel {

    public static void main(String[] args) {

        boolean flag = false;
        String s = "adarshi";
        char c = 'e';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                flag = true;
            }
        }
        System.out.println(flag);
    }

}
