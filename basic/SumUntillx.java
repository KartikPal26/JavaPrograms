import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SumUntillx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum =0;
        while (true) {
            String input = in.next();
            if (input.equalsIgnoreCase("x")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'x' to stop.");
            }
        }

        System.out.println("Sum of entered numbers: " + sum);

    }
}