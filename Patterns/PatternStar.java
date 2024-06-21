import java.util.Scanner;

public class PatternStar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Range: ");
        int n = in.nextInt();
        int mid = n/2+1;
        int a = 1;
        int b = n;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++) {
                if (j == a||j==mid||j==b ){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            a++;
            b--;
            System.out.println();
        }
    }
}