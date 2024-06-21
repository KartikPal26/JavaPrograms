import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = in.nextInt();
        int st = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<n;j++){
                if(i==1||i==n){
                    System.out.print("*");
                }else if(j==1||j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}