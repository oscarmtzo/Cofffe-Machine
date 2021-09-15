import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}