import java.util.Scanner;

public class SumOfFirstN_NaturalNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int sum =0;
        for(int i =1;i<=n;i++){
            sum = sum + i;
        }
//        while(n!=0){
//            sum = sum +n;
//            n--;
//        }
        System.out.println(sum + " is Sum of given n natural number");
    }
}
