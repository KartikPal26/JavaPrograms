import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(palindrome(n));
    }
    static boolean palindrome(int n){
        int rem =0;
        int temp =n;
        int rev =0;

        while(n!=0){
            rem = n%10;
            rev= rev*10+rem;

            n/=10;
        }
        if (temp== rev ){
            return true;
        }
        return false;
    }
}
