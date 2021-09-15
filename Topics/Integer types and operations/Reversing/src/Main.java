import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int total = scanner.nextInt();
        int a;
        int b;
        int c;
        a = total / 100;
        b = (total % 100) / 10;
        c = total % 10;
        System.out.println(
                (c == 0) ?
                        b+""+a :
                        c+""+""+b+""+a
        );
        System.out.println(" Inside Main".substring(0,6));

    }
}
