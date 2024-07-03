import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float P= in.nextFloat();
        float T= in.nextFloat();
        float R= in.nextFloat();
        float SI= P*T*R/100;
        System.out.println(SI);
    }
}
