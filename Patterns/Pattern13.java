import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= in.nextInt();
        int st =1;
        int sp =n-1;

        for(int i=1;i<n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                if(j==1||j==st){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            st++;
            sp--;
        }
        for(int j=1;j<=2*n-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
