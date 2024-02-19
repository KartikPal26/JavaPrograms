import java.util.Scanner;

public class SumOfNumbersInARange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = in.nextInt();
        int sum =0;
        for(int i=n1;i<=n2;i++){
            sum = sum +i;
            System.out.println(sum);
        }
    }
}
