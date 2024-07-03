import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        double sq = (double)Math.sqrt(num);
        System.out.println(sq);
        int i=0;
        for(i = 1; i<=(num)/2;i++){
            if(i==sq){
                System.out.println("Perfect Square");
                break;
            }
        }
        if(i!=sq){
            System.out.println("Not Perfect Square");
        }

    }
}
