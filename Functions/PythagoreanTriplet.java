import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(pythagoreanTriplet(a,b,c));

    }
    static int pythagoreanTriplet(int a, int b, int c){
        return (Math.pow(a,2)+Math.pow(b,2))==Math.pow(c,2)?1:0;
    }
}
