import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        int c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        boolean res = (a != b) && (a != c) && (b != c);
        System.out.println(res);
    }
}
