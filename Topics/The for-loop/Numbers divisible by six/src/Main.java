import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int nInputs = in.nextInt();
        int total = 0;
        for (int i = 0; i < nInputs; i++) {
            int num = in.nextInt();
            if (num % 6 == 0) {
                total += num;
            }
        }
        System.out.println(total);
    }
}