import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        System.out.println(circumference(r));
    }
    public static double circumference(int r) {
        return 2*Math.PI*r;
    }
}
