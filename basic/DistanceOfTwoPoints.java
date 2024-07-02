import java.util.Scanner;

public class DistanceOfTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter point one : ");
        int pointOne = in.nextInt();
        System.out.println("enter point two : ");
        int pointTwo = in.nextInt();
        if(pointOne>pointTwo){
            System.out.println(pointOne-pointTwo);

        }else {
            System.out.println(pointTwo-pointOne);

        }
    }
}
