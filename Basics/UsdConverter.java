import java.util.Scanner;

public class UsdConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value in rs :");
        float cu = in.nextInt();
        cu = (float)(cu/83.37);

        System.out.println("value of rs in usd is " + cu);

    }
}
