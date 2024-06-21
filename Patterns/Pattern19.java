import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= in.nextInt();
        int st =1;
        int sp =n-2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=st;j++){
                System.out.print("*");
            }
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            if(i==(n/2)+1){
                st--;
            }
            for(int j=1;j<=st;j++){
                System.out.print("*");
            }
            if(i==(n/2)+1){
                st++;
            }
            System.out.println();
            if(i<=(n/2)){
                st++;
                sp-=2;
            }else{
                st--;
                sp+=2;
            }
        }
    }
}
