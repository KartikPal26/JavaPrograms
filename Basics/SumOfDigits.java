import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum =0;
        int rem =0;

        while(n!=0){
            rem = n%10;
            n /= 10;
            sum += rem;
        }
        System.out.println(sum);
    }
}
