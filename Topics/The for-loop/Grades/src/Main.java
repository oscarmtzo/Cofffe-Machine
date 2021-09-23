import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int nInputs = in.nextInt();
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;
        for (int i = 0; i < nInputs; i++) {
            int grade = in.nextInt();
            if (grade == 5) {
                a++;
            } else if (grade == 4) {
                b++;
            } else if (grade == 3) {
                c++;
            } else if (grade == 2) {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}