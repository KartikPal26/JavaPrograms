import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= in.nextInt();
        int a,b;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                a=1;
                b=0;
            }else{
                a=0;
                b=1;
            }
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                int temp = a;
                a = b;
                b = temp;

            }
            System.out.println();
        }
    }
}
