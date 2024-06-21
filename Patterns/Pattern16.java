import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= in.nextInt();
        int st =1;
        int sp =n;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            int x=1;
            for(int j=1;j<=st;j++){
                System.out.print(x+" ");
                x=x*(i-j)/j;
            }
            System.out.println();
            st+=1;
            sp-=1;
        }
    }
}
