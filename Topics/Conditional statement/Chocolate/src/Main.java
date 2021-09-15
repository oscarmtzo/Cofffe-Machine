import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int nLength = in.nextInt();//2
        int mWidth = in.nextInt();//7
        int kSegments = in.nextInt();//10

        if (nLength * mWidth < kSegments) {
            System.out.println("NO");
        }else if (nLength * mWidth == kSegments) {
            System.out.println("YES");
        }else if (kSegments % mWidth == 0) {
            System.out.println("YES");
        }else if (kSegments % nLength == 0){
            System.out.println("YES");
        }else if (nLength*mWidth - kSegments == nLength){
            System.out.println("YES");
        }else if (nLength*mWidth - kSegments == mWidth){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }



    }
}