import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int st=n;
        int sp=0;

        for(int i=1;i<=n;i++){
            if(i==(n/2)+1){
                for(int j=1;j<=n;j++){
                    System.out.print("* ");
                }
            }else{
                for(int j=1;j<=sp;j++){
                    System.out.print("  ");
                }
                for(int j=1;j<=st;j++){
                    if(j==1||j==(st/2)+1||j==st){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            if(i<(n/2)+1){
                st-=2;
                sp++;
            }
            else{
                st+=2;
                sp--;
            }
            System.out.println();
        }
    }
}
