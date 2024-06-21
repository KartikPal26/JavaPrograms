import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= in.nextInt();
        int st1 =1;
        int st2 =1;
        int sp1 =n-1;
        int sp2 =2*n-2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st1;j++){
                if(j==1||j==st1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=sp2-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st2;j++){

                if(j==1||j==st2){

                    if(i==n){
                        st2--;
                    }
                    if(j==1&&i==n){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }

                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            st1+=2;
            st2+=2;

            sp1-=1;
            sp2-=2;
        }
    }
}
