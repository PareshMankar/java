import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        
       String personalised  = Mygreet("Paresh");
        System.out.println(personalised);
        }

    private static String Mygreet(String name) {
        String message = "hello " + name;
        return message;
    }
}

