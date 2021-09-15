import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        String str = in.next();
        str = str.replace('a','b');
        System.out.println(str);
    }
}
