import java.util.Scanner;

public class Pattern27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= in.nextInt();
        int sp=0;
        int st=n;
        int count1=1;
        int count2=n*n+1;
        int count3=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            count3=0;
            for(int j=1;j<=st;j++){
                System.out.print(count1+" ");
                count1++;
                count3++;
            }
            for(int j=1;j<=st;j++){
                System.out.print(count2+" ");
                count2++;
                
            }
            System.out.println();
            st--;
            sp++;
        }
    }
}
