import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(evenAndOdd(n));
    }

    private static String evenAndOdd(int n) {
        return (n%2 ==0)?"Even":"Odd";
    }
}
