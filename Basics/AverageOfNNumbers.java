import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;

        while(true){
            n= in.nextInt();
            if(n== -1){
                break;
            }
            sum +=n;
        }
        double average = sum/2;
        System.out.println(average);
    }
}
