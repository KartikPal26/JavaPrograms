import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= in.nextInt();
        int st =1;
        int sp =n-3;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("*");
            }
            for(int j=1;j<=st;j++){
                if(j==1||j==st){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=sp;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<(n/2)+1){
                st+=2;
                sp-=1;
            }
            else{
                st-=2;
                sp+=1;
            }
        }
    }
}
