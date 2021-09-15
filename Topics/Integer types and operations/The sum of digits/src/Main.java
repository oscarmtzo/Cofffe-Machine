import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int value = scanner.nextInt();
        int modV1 = value / 100;
        int modV2 = (value % 100) / 10;
        int modV3 = value % 10;
        int total = modV1 + modV2 + modV3;
        System.out.println(total);
    }
}
