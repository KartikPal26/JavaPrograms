import java.util.Scanner;

public class NcrAndNpr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n and r ");
        int n = in.nextInt();
        int r = in.nextInt();
        if(n>r){
            int ncr = fact(n)/(fact(r)*fact(n-r));
            int npr = fact(n)/fact(n-r);
            System.out.println(ncr);
            System.out.println(npr);
        }else{
            System.out.println("not valid input");
        }

    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
