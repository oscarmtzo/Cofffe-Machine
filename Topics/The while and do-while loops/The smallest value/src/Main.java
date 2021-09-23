import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        long n = 1;
        int i = 1;
        long number = in.nextLong();
        while (number >= i * n ) {
            n *= i;
            i++;
        }

        System.out.println(i);
    }
}