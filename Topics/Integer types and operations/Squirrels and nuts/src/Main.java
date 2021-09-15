import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int residue = value2 % value1;
        System.out.println(residue);
    }
}
