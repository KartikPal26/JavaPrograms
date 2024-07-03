import java.util.Scanner;

public class NNaturalNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        System.out.println(nNaturalNumberSum(n));
    }

    private static int nNaturalNumberSum(int n) {
        if (n == 1) {
            return 1;
        }
        return nNaturalNumberSum(n-1)+n;
    }
}
