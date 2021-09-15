//put imports you need here
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        String num1 = in.nextLine();
        String num2 = in.nextLine();
        String num3 = in.nextLine();
        String num4 = in.nextLine();
        String num5 = in.nextLine();

        System.out.println("The form for " + num1 +
            " is completed. We will contact you if we need a chef that cooks "
            + num5 + " dishes.");
    }
}