import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rev = 0;
        int rem=0;
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        while(num!=0){
            rem =num%10;
            rev =rev*10+rem;
            num =num/10;
        }
        System.out.println(rev);


    }
}
