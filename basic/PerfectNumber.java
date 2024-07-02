import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum  =0;
        int n = in.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum += i;
            }
        }
        if(sum ==n){
            System.out.println("Perfect  number");
        }else{
            System.out.println("Not Perfect number");
        }
    }
}
