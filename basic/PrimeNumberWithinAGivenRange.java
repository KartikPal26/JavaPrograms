import java.util.Scanner;

public class PrimeNumberWithinAGivenRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n1 = in.nextInt();
        System.out.print("Enter the number: ");
        int n2 = in.nextInt();

        for(int i =n1;i<=n2;i++){
            if(primeNumber(i))
                System.out.println(i);
        }
    }

    static boolean primeNumber(int num){
        if(num<2)
            return false;
        for(int i =2;i*i<num;i++){
            if(num%i ==0){
                return false;
            }
        }
        return true;
    }
}
