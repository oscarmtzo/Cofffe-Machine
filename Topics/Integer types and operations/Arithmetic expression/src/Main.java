import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int value = scanner.nextInt();
        value = ((value + 1) * value + 2) * value + 3;
        System.out.println(value);
    }
}
