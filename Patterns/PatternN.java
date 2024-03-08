import java.util.Scanner;

public class PatternN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= in.nextInt();
        int st =2*n-3;
        int sp =1;

        for(int j=1;j<=2*n-1;j++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=2;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                if(j==1||j==st){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            st-=2;
            sp++;
        }
    }
}
