import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double commissionAmount = 0;
        System.out.println("Enter the sales price : ");
        int salesPrice = in.nextInt();
        System.out.println("Enter the commission percentage : ");
        double percentage = in.nextDouble();
        commissionAmount = salesPrice*percentage/100;
        System.out.println(commissionAmount);
//        [ \text{Commission Amount} = \frac{\text{Sale Price} \times \text{Commission Percentage}}{100} ]
    }
}
