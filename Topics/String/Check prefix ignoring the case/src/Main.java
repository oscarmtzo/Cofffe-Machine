import java.util.Locale;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.toUpperCase();
        System.out.println(str.startsWith("J"));
    }
}
