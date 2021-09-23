import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int divisible = in.nextInt();
        int accumulator = 0;
        for (int i = 0; i <= (end - start) / divisible; i++) {
            accumulator++;
        }

        //accumulator = end /divisible;
        System.out.println(accumulator);
    }
}