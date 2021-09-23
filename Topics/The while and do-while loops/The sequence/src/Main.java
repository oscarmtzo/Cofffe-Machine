import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int inputs = in.nextInt();
        int greaterNum = 0;
        while (inputs > 0) {
            int value = in.nextInt();
            if (greaterNum < value && value % 4 == 0) {
                greaterNum = value;
            }
            inputs--;
        }
        System.out.println(greaterNum);
    }
}