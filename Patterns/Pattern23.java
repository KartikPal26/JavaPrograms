import java.util.Scanner;

public class Pattern23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= in.nextInt();
        int st=n;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(count);
            }
            count++;
            System.out.println();
            st--;
        }
    }
}
