import java.util.Scanner;

public class countnums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        int count = 0;
        int cn = in.nextInt();
        while (n>0){
            if (cn == n % 10){
                count++;
            }
            n = n /10;
        }
        System.out.println(count);
    }
}
