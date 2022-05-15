package methods;

public class methodques {
    public static void main(String[] args) {
        //create a function which takes the name of the user and greets with message good morning <name>
        greet("Abhiiiii");

    }

    public static void greet(String name) {  //public --> optional
        System.out.printf("Good morning %s", name);
       // System.out.println("Good morning" +name);
    }
}
