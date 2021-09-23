import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        long firstNum = in.nextLong();
        String operation = in.next();
        long secondNum = in.nextLong();
        switch (operation) {
            case "+":
                System.out.println(firstNum + secondNum);
                break;
            case "-":
                System.out.println(firstNum - secondNum);
                break;

            case "/":
                if (secondNum == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(firstNum / secondNum);
                }
                break;

            case "*":
                System.out.println(firstNum * secondNum);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }

    }
}