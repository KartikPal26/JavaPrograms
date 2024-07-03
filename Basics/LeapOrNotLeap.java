import java.util.Scanner;

public class LeapOrNotLeap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        year =year % 100;
        if(year %4==0){
            System.out.println("leap year");
        }else {
            System.out.println("Not leap year");
        }
    }
}
