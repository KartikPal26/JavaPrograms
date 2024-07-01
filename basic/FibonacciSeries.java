import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a =0;
        int b =1;
        int c =0;
        for(int i=1;i<=n;i++){
            if(i==1){
                System.out.println(a);
            }if(i==2){
                System.out.println(b);
            }if(i>2){
                c =a+b;
                System.out.println(c);
                a=b;
                b=c;
            }

        }

    }
}
