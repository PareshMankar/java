import java.util.Scanner;

public class revno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long rem = 0;
        long ans = 0;
        while (a>0){
            rem = a % 10;
            ans = ans * 10 + rem;
            a = a /10;
        }
        System.out.println(ans);
    }
}
