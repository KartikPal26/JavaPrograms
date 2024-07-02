import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the original price = ");
        int originalPrice = in.nextInt();
        System.out.print("Enter the discount percent = ");
        double discountPercentage = in.nextDouble();
        double DiscountPrice = originalPrice - (originalPrice*discountPercentage/100);
        System.out.println(DiscountPrice);

        // [ \text{Discount %} = \frac{10}{80} \times 100 = 12.5% ]
    }
}
