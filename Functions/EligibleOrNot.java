import java.util.Scanner;

public class EligibleOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println(eligible(age));

    }
    private static String eligible(int age) {
        return (age>=18)?"Eligible":"Not Eligible";
    }
}
