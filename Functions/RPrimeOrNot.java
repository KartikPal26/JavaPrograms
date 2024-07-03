import java.util.Scanner;

public class RPrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        for(int i=n1;i<=n2;i++){
            if(prime(i)){
                System.out.println(i);
            }
        }
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
