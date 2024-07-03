import java.util.Scanner;

public class ArmstrongNumberInAGivenRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lower= in.nextInt();
        int upper= in.nextInt();
        for(int i=lower;i<=upper;i++){
            ArmStrongNumberInGivenRange(i);
        }
    }
    static int ArmStrongNumberInGivenRange(int num){

        int numb = num;
        int a = num;
        int n = 0;
        while(a>0){
            n++;
            a/=10;
        }
        int an = 0;
        int rem =0;
        int rev =0;
        int arm =0;

        while(numb>0){
            rem =numb%10;
            int power = (int) Math.pow(rem,n);
            an = an+power;
            numb =numb/10;
        }
        if(an == num){
            System.out.println(an +" is an Armstrong Number");
        }
        return an;

    }
}
