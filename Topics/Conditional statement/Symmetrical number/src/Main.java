import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        String a  = in.next();

        if (a.charAt(0) == a.charAt(3) && a.charAt(1) == a.charAt(2)) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}