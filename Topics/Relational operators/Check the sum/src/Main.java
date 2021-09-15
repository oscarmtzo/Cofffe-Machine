import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean response;
        if (a+b==20){
            response = true;
        }else if(a+c==20){
            response = true;
        }else if( b + c == 20){
            response = true;
        }else{
            response = false;
        }
        System.out.println(response);
        
    }
}
