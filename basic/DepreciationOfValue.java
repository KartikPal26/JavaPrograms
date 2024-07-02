import java.util.Scanner;

public class DepreciationOfValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Asset cost");
        int Asset = in.nextInt();
        System.out.println("Enter the residual value");
        int residual = in.nextInt();
        System.out.println("cost of Useful life an Asset");
        int ula = in.nextInt();
        System.out.println("Cost of depreciation : " );
        int dm = (Asset - residual )/ula;
        System.out.println("value of depreciation : "+ dm);
    }
}
