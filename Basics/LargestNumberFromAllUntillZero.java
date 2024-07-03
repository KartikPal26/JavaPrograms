import java.util.Scanner;

public class LargestNumberFromAllUntillZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max;
        int b =0;
        while(true){
            int a = in.nextInt();
            if (a == 0) {
                break;
            }
            if(a>b){
                max=a;
            }else{
                max=b;
            }
            b=max;
        }
        System.out.println(b);
    }
}
