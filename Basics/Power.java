import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter  the number : ");
        int n = in.nextInt();
        System.out.println("enter the power : ");
        int pow = in.nextInt();
        int ans=1;
        for(int i = 1;i<=pow;i++){
            ans *=n;
        }
        System.out.println(ans);
        System.out.println(Math.pow(n,pow));

    }
}
