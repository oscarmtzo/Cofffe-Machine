import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        if (a%2==0){a+=2;}else{ a+=1;}
        System.out.println(a);
        
    }
}
