import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        String cadena = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(cadena.subSequence(start,++end));
    }
}