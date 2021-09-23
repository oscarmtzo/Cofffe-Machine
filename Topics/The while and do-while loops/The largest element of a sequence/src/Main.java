import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int num;
        int accumulator = 0;

        do {
            num = in.nextInt();
            if (num > accumulator) {
                accumulator = num;
            }
        } while (num != 0);

        System.out.println(accumulator);
    }
}