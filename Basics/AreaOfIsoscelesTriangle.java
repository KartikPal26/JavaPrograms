import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the base: ");
        int b = in.nextInt();
        System.out.println("enter the height: ");
        int h = in.nextInt();
        double area = 0.5*b*h;
        System.out.println("Area is: "+ area);

    }
}
