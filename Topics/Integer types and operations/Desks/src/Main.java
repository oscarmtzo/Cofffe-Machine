import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // put your code here
        int salon1 = in.nextInt();
        int salon2 = in.nextInt();
        int salon3 = in.nextInt();
        
        int bancas = 0;
        
        bancas += salon1 / 2 + salon1 % 2;
        bancas += salon2 / 2 + salon2 % 2;
        bancas += salon3 / 2 + salon3 % 2;
        
        System.out.println(bancas);
    }
}
