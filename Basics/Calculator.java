import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int a = in.nextInt();
        System.out.println("enter the number: ");
        int b = in.nextInt();
        System.out.println("enter the opertor: ");
        String sym = in.next();
        switch (sym){
            case "+" ->System.out.println(a+b);
            case "-" ->System.out.println(a-b);
            case "*" -> System.out.println(a*b);
            case "/" -> System.out.println(a/b);
            default -> System.out.println("incorrect operation");

        }
    }
}
