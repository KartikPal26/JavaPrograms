import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Cost =0;
        System.out.print("Enter the the Wattage : ");
        int Wattage = in.nextInt();
        System.out.print("Enter the Hours : ");
        double Hour = in.nextDouble();
        System.out.print("Enter the Electricity Rate : ");
        double ElectricityRate = in.nextDouble();
        Cost = Wattage*Hour*ElectricityRate;
        System.out.println(Cost);
    }
}
