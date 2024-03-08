import java.util.Scanner;

public class PatternQ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= in.nextInt();
        int i,j,c;
        int st=1;
        int sp=(n/2)+1;
        for(i=1;i<=n;i++){
            c=i;
            for(j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(j=1;j<=st;j++){
                if(i<=(n/2)+1){
                    System.out.print(c);
                }
                else{
                    System.out.print(n-i+1);
                }
            }
            System.out.println();
            if(i<=sp){
                st+=2;
                sp--;
            }
            else{
                st-=2;
                sp++;
            }
        }
    }
}
