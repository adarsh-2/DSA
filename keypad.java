import java.util.*;

public class keypad {

    public static void main(String[] args) {

        HashMap<Character,String> HM = new HashMap<Character,String>();

        HM.put('A', "2");
        HM.put('B', "22");
        HM.put('C', "222");
        HM.put('D', "3");
        HM.put('E', "33");
        HM.put('F', "333");
        HM.put('G', "4");
        HM.put('H', "44");
        HM.put('I', "444");
        HM.put('J', "5");
        HM.put('K', "55");
        HM.put('L', "555");
        HM.put('M', "6");
        HM.put('N', "66");
        HM.put('O', "666");
        HM.put('P', "7");
        HM.put('Q', "77");
        HM.put('R', "777");
        HM.put('S', "7777");
        HM.put('T', "8");
        HM.put('U', "88");
        HM.put('V', "888");
        HM.put('W', "9");
        HM.put('X', "99");
        HM.put('Y', "999");
        HM.put('Z', "9999");    }
        // HM.put(' ', "0");   
        
        String s = "GEEKSFORGEEKS";

        String ans = "";

        for(int i = 0; i<s.length(); i++){
                char gb = s.charAt(i) ; 
                String bb = HM.get(gb) ; 
            if(s.charAt(i) == ' '){
                ans = ans + "0";
            }
            else{
                
                ans = ans + gb ;
            }
        }

        System.out.println(ans);
        
}