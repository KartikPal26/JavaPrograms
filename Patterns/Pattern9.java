import java.util.Scanner;

public class PatternI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= in.nextInt();
        int st =2*n-1;
        int sp =0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=st;j++){
                System.out.print("* ");
            }
            System.out.println();
            st-=2;
            sp++;
        }
    }
}
