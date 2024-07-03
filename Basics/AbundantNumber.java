import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int temp = n;
        int sum = 0;
        int i =0;
        for(i=1;i<n;i++){
            if(n%i==0){
                sum += i;
            }
        }
//        System.out.println(n);
//        System.out.println(sum);

        if (sum>temp){
            System.out.println("Abundant Number");
        }else{
            System.out.println("Not an abundant number ");
        }

    }
}
