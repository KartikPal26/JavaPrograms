import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();
        if(((year%100==0)&&(year%400==0))||(year%4==0)){
            System.out.println("Year is an Leap Year");
        }else{
            System.out.println("Not an Leap Year");
        }
    }
}
