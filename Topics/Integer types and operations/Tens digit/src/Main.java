import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int value = scanner.nextInt();
        value = (value%100)/10;
        System.out.println(value);
    }
}
