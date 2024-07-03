import java.sql.SQLOutput;
import java.util.Scanner;
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println(max(a,b,c));
        System.out.println(min(a,b,c));


    }
    static int max(int a,int b,int c){
        return Math.max(a,Math.max(b,c));
    }
    static int min(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }

}
