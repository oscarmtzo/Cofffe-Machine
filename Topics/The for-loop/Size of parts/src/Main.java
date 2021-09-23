import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int inputs = in.nextInt();
        int ready = 0;
        int fix = 0;
        int rejects = 0;
        for (int i = 0; i < inputs; i++) {
            int part = in.nextInt();
            if (part == 1) {
                fix++;
            } else if (part == -1) {
                rejects++;
            } else if (part == 0) {
                ready++;
            }
        }
        System.out.println(ready + " " + fix + " " + rejects);

    }
}