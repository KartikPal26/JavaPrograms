import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        int sum =0;
        int rem =0;
        int fact =1;
        int x =0;
        while(n!=0){
            rem=n%10;
            fact =1;
            x=rem;
            fact = 1;
            for(int i=1;i<=x;i++){
                fact =fact*i;
            }
            sum=sum+fact;
            n/=10;
        }
        System.out.println(sum);
    }
}
