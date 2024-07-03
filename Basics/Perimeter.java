import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the radius: ");
        int r = in.nextInt();

        System.out.println(perimeterOfCircle(2));

    }
    static double perimeterOfCircle(int r){
        return 2*Math.PI*r;
    }
    static double perimeterOfEquilateralTriangle(int a){
        return 3*a;
    }
    static double perimeterOfParallelogram(int a,int b){
        return 2*(a+b);
    }
    static double perimeterOfRectangle(int a,int b){
        return 2*(a+b);
    }
    static double perimeterOfSquare(int a){
        return 4*a;
    }
    static double perimeterOfRhombus(int a){
        return 4*a;
    }
}
