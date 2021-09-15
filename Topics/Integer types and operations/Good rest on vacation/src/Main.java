import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // put your code here
        int days = in.nextInt();
        int foodPerDay = in.nextInt();
        int flight = in.nextInt();
        int nightHotel = in.nextInt();
        
        int total = 0;
        
        total += (days * foodPerDay) 
            + ((days - 1) * nightHotel) 
            + (flight + flight);
            
        System.out.println(total);
    }
}
