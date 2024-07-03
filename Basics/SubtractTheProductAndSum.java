import java.util.Scanner;

public class SubtractTheProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = subtractTheProductAndSum(564);
        System.out.println(ans);
    }

    private static int subtractTheProductAndSum(int n) {
        int subtract =0;
        int a=n;
        int rem =0;

        int sum =0;
        int product =1;
        while(a!=0){
            rem = a%10;
            a /=10;
            sum += rem;
            product *= rem;
        }
        return product-sum;
    }
}
