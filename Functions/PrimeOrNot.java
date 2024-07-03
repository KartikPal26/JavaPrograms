import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(prime(n));
    }

    private static boolean prime(int n) {
        for(int i=2;i<n;i++){
            if(n==2){
                break;
            }else{
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
