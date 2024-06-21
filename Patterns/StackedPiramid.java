import java.util.Scanner;

public class StackedPiramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int st=1;
        int sp=n;
        int sp2=n/2-1;

        for(int i=1;i<=n;i++){
            if(i<n/2+1){
                for(int j=1;j<=sp;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=st;j++){
                    System.out.print("* ");
                }

            }else{
                for(int j=1;j<=sp;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=st;j++){
                    System.out.print("* ");
                }
                for(int j=1;j<=sp2;j++){
                    System.out.print("  ");
                }
                for(int j=1;j<=st;j++){
                    System.out.print("* ");
                }
                sp2--;
            }

            System.out.println();
            sp--;
            if(st==n/2){
                st=1;
            }
            else{
                st++;
            }
        }
    }
}
