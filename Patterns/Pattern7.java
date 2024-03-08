import java.util.Scanner;

public class PatternG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= in.nextInt();
        int st =n;
        int sp =0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=st;j++){
                System.out.print(" 55*");
            }
            System.out.println();
            st--;
            sp++;
        }
    }
}
