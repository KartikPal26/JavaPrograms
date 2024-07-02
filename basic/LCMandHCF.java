import java.util.Scanner;

public class LCMandHCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int temp=0;
        for(int i =1;i<=b;i++){
            if(a%i==0&&b%i==0){
                temp = i;
            }
        }
        int lcm =a*b/temp;
        System.out.println(lcm +" "+ temp);
    }

}
