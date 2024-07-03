import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int base = in.nextInt();
        int exponent =in.nextInt();
        int power = (int)Math.pow(base,exponent);
        System.out.println(power);


    }
}
