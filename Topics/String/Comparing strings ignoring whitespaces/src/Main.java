import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        //str1.
        str1 = str1.replaceAll(" ", "");
        str2 = str2.replaceAll(" ","");

        //System.out.println(str2 + '\n'+ str1);
        System.out.println(str1.equals(str2));
        
    }
}
