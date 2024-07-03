import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the grade points: ");

        int sum =0;
        int num =0;
        while(num<5){
            int n=in.nextInt();
            sum +=n;
            num++;
        }
        System.out.println(sum/5);
    }
}
