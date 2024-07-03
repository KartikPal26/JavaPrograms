import java.util.Scanner;

public class SumNegitivePositiveEvenAndOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,neg,even,odd;
        neg =0;
        even =0;
        odd =0;
        while(true){
            n = in.nextInt();
            if(n==0){
                System.out.println("Sum of negative number : "+ neg);
                System.out.println("Sum of Positive Even number : "+ even);
                System.out.println("Sum of Positive Odd number : "+ odd);
                break;
            }
            if(n<0){
                neg += n;
            }
            else if(n%2==0){
                even += n;
            }
            else{
                odd += n;
            }
        }
    }
}
