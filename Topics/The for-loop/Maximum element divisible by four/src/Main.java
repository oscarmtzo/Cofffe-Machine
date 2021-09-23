import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int nInputs = in.nextInt();
        int greaterNum = 0;
        for (int i = 0; i < nInputs; i++) {
            int num = in.nextInt();
            if (num % 4 == 0 && num > greaterNum) {
                greaterNum = num;
            }
        }
        System.out.println(greaterNum);
    }
}