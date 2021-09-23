import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();

        for (; start <= end; start++) {
            if (start % 3 == 0 && start % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (start % 3 == 0) {
                System.out.println("Fizz");
            } else if (start % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(start);
            }
        }

    }
}