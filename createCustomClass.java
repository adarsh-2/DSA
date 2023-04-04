class student {
    int id;
    String name;
}

public class createCustomClass {
    public static void main(String[] args) {

        // Instantiating a new student object
        student Adarsh = new student();
        int[] arr = new int[7];
        // Setting attribute of the object;
        Adarsh.id = 4;
        Adarsh.name = "Rohit";
        System.out.println(Adarsh.id);
        System.out.println(Adarsh.name);
    }
}
