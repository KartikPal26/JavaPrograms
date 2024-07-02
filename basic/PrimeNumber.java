import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 5;
        boolean  flag = false;
        if (num==2){
            flag = true;
        }
        else {
            for(int i=2;i*i<=num;i++ ){
                if(num%i==0){
                    flag = false;
                    break;
                }
                flag = true;
            }
        }

        if (flag){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
