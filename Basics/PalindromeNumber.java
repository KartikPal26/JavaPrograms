import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int temp = in.nextInt();
        int num = temp;
        int rev = 0;
        int rem=0;

        while(temp!=0){
            rem =temp%10;
            rev =rev*10+rem;
            temp =temp/10;
        }
        if(rev == num){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("not Palindrome");
        }

    }
}
