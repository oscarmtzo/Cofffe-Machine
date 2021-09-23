import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        float m = in.nextInt();
        float p = in.nextFloat();
        p /= 100;
        int k = in.nextInt();
        int years = 0;
        while (k > m) {
            m = m * p + m;
            years++;
        }
        System.out.println(years);

    }
}