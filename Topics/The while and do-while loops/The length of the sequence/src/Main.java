import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int accumulator = 0;
        boolean flag = true;
        do {
            int value = in.nextInt();
            if (value != 0) {
                accumulator++;
            } else {
                flag = false;
            }
        } while (flag);
        System.out.println(accumulator);
    }
}