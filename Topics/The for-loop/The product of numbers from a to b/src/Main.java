import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        long accumulator = 1;
        for (; start < end; start++) {
            accumulator *= start;
        }

        System.out.println(accumulator);
    }
}