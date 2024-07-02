import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int product=1;

        for(int i=1;i<=n;i++){
            product *=i;
        }
        System.out.println(product);

    }
}
