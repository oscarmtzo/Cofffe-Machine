import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // put your code here
        int hour1 = in.nextInt();
        int min1 = in.nextInt();
        int sec1 = in.nextInt();
        int hour2 = in.nextInt();
        int min2 = in.nextInt();
        int sec2 = in.nextInt();
        int result = 0;
        
        result -= (hour1 * 60 * 60);
        result += (hour2 * 60 * 60);
        result -= (min1 * 60);
        result += (min2 * 60);
        result -= sec1;
        result += sec2;
        
        System.out.println(result);
        
    }
}
