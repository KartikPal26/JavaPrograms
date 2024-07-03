import java.util.Scanner;

public class SumOfAllNumbersUntillZero {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum =0;
        int n;
        while(true){
            n = in.nextInt();
            if(n==0){
                break;
            }
            else{
                sum = sum +n;
            }
        }
        System.out.println(sum);
    }
}
