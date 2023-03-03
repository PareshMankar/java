import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter temp. in celsius");
        float celsius = input.nextFloat();
        float farhenite = (float) (1.8 * celsius+ 32);
        System.out.println("temperature in farhenite is " + farhenite);
    }
}