import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        double x1 = in.nextInt();
        double y1 = in.nextInt();
        double x2 = in.nextInt();
        double y2 = in.nextInt();

        double degree0 = 0.0;
        double degree360 = Math.round((Math.PI * 2) * 10_000.0) / 10_000.0;
        double degree45 = Math.round((Math.PI / 4) * 10_000.0) / 10_000.0;
        double degree90 = Math.round((Math.PI / 2) * 10_000.0) / 10_000.0;
        double degree135 = Math.round((Math.PI * (3 / 4)) * 10_000.0) / 10_000.0;
        double degree180 = Math.round((Math.PI ) * 10_000.0) / 10_000.0;
        double degree225 = Math.round((Math.PI * (5 / 4)) * 10_000.0) / 10_000.0;
        double degree270 = Math.round((Math.PI * (3 / 2)) * 10_000.0) / 10_000.0;
        double degree315 = Math.round((Math.PI * (3 / 2)) * 10_000.0) / 10_000.0;



        double hipotenuse = Math.sqrt(
                Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)
        );
        double theta = Math.round((Math.asin(Math.abs(y2 - y1) / hipotenuse) ) * 10_000.0) / 10_000.0;

        if (theta == degree0 || theta == degree45 || theta == degree90 || theta == degree135 || theta == degree180 || theta == degree225 || theta == degree270 || theta == degree315 || theta == degree360){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
/*
        System.out.println(hipotenuse);
        System.out.println(theta);
        System.out.println(Math.round((Math.PI * (5/4)) * 10_000.0) / 10_000.0);
        System.out.println(Math.abs((double) -1));*/
    }
}