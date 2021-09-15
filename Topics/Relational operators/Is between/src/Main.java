import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // put your code here
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(
                (a>=b && a<=c || a<=b && a>=c)? true:false
        );

    }
}