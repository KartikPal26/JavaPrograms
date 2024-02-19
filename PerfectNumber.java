import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum=0;
        int num = in.nextInt();
        for(int i=0; i<=num; i++){
            sum= sum +i;
            if(sum == num){
                System.out.println(sum +" is a Perfect Number");
                break;
            }
        }
        if(sum!=num){
            System.out.print(num +" is not a Perfect Number");
        }
    }
}
