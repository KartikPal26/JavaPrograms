import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length: ");
        int l = in.nextInt();
        System.out.println("enter the breath: ");
        int b = in.nextInt();

        int area = l*b;
        System.out.println("Area is: "+ area);

    }
}
