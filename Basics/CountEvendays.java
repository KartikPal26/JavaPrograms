import java.util.Scanner;

public class CountEvendays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the days in a Month : ");
        int days = in.nextInt();
        int count;
        count =0;
        for(int i =1;i<=days;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("Number of days you can go in a month : "+ count);
    }
}
