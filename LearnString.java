public class LearnString
{
    public static void main(String[] args)
    {

        String str = "geeks";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.substring(2));
        
        // Last index is not included
        System.out.println(str.substring(2,4));

        System.out.println("-----------------------------");

        String s1 = "geeks";
        String s2 = "geeks";

        if(s1==s2)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        String s3 = new String("geeks");

        if(s1==s3)
        System.out.println("Yes");
        else
        System.out.println("No");

        System.out.println("--------------------------------------");
        
        String sa = "geeksforgeeks";
        String sb = "geeks";
        
        // .contains function checks if the string is present in another string
        if(sa.contains(sb))
        System.out.println("true");
        else
        System.out.println("false");

        System.out.println("--------------------------------------");
        
        String sI = "adarsh";
        String sII = "adarsh";
        
        if(sI.equals(sII))
        System.out.println("true");
        else
        System.out.println("false");

        System.out.println("--------------------------------------");

        String sIII = "geeksforgeeks";
        String sIV = "eeks";

        // .compareTo function
        // will return 0 if the strings are lexicographically same
        // will return +ve value if 1st string is lexicographically greater
        // will return -ve value if string passed in the parameter is lexicographically greater
        // lexicographically = alphabetical
        int res = sIII.compareTo(sIV);
        System.out.println(res);

        // indexOf function will return index of starting character of the string passed in the parameter
        // if string is not present then it will return -1
        System.out.println(sIII.indexOf(sIV));

        // when we pass second parameter it will start searching from that index
        System.out.println(sIII.indexOf(sIV,4));

        String t1 = "geeks";
        String t3 = "geeksforgeeks";
        String t2 = t1;

        // when we concat a string a new string object is created since strings are immutable and the variable starts
        // pointing towards it
        t1 = t1 + "forgeeks"; // t1 = t1.concat("forgeeks");
        System.out.println(t3==t1);

    }
}
