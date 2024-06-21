import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= in.nextInt();
        int st =n/2;
        int sp =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<(n/2)){
                st--;
                sp++;
            }else{
                if(i<(n/2)+1){
                    st=1;
                    sp=(n/4)+1;
                }else{
                    st++;
                    sp--;
                }
            }
        }
    }
}
