import java.util.Scanner;
public class NthTermOfTheFibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        fibonacci(num);
    }
    static int fibonacci(int num) {
        int a = 0;
        int b = 1;
        int count = 0;
        if(num>0){
            if(num>1){
                count =2;
            }
            count =1;
        }
        int c = 0;
        for (int i = 3; i <= num; i++) {
            c = a + b;
            a = b;
            b = c;
            count++;
            if(count>c){
                return count;
            }
        }
        return count;
    }
}
