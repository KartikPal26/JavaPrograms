import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the radius: ");
        float r = in.nextFloat();
        double area = Math.PI*r*r;
        System.out.println("Area is: "+ area);

    }
}
