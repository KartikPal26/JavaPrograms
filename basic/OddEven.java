import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
