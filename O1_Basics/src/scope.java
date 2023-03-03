import java.util.Scanner;

public class scope {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int user = in.nextInt();

        int a = user % 10;
        int b = (user / 10) % 10;
        int c = user / 100;

        int amstr = (a * a * a) + (b * b * b) + (c * c * c);
        System.out.println(amstr);
    }
}
