import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();
        boolean flag = false;
        for(int i =2;i*i<n;i++){
            if(n%i !=0){
                flag = true;
            }
        }
        if(flag == true){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }


    }
}
