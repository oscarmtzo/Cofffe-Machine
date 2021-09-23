import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int divisibleBy = 3;
        float average = 0;
        int numbers = 0;

        for (int i = start; i <= end; i++) {
            if (i % divisibleBy == 0) {
                average += i;
                numbers++;
            }
        }
        average /= numbers;
        System.out.println(average);
    }
}