import java.util.Scanner;

public class PatternE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= in.nextInt();
        for(int i=1;i<=n;i++){
            if(i<=(n/2)+1){
                for(int j=1;j<=i;j++){
                    System.out.print(" *");
                }
                System.out.println();
            }
            else{
                for(int j=i;j<=n;j++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }
}
