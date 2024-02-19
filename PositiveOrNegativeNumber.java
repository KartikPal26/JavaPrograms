import java.util.Scanner;

public class PositiveOrNegativeNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        if(a>=0){
            System.out.println(a + " is positive number");
        }
        else{
            System.out.println(a + " is negative number");
        }
    }
}
