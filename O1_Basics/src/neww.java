import java.util.Scanner;

public class neww {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        //maxmin( );
    }

    int maxmin(int a, int b, int c) {

        int max =  a;
        if(b> max) {
            b =max;
        }
        if(c > max){
            c = max;
        }
        return max;
    }
}
