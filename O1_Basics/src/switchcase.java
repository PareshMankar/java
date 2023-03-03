import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Apple" -> System.out.println("sweet red fruit");
            case "Orange" -> System.out.println("round fruit");
            case "grapes" -> System.out.println("small fruit");
        }
    }
}
