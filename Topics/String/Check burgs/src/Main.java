import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        String city = in.nextLine();
        System.out.println(city.endsWith("burg"));
    }
}