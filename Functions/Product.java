import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(product(a,b));
    }

    private static int product(int a, int b) {
        return a*b;
    }
}
