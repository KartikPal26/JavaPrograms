import java.util.Scanner;

public class PythogramTheorem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = Math.max(a,Math.max(b,c));
        if(a==max){
            if((a*a) == (b*b) + (c*c)){
                System.out.println("This is an right angle Triangle");
            }else{
                System.out.println("It is not an right angle Triangle");
            }

        }
        else if(b==max){
            if((b*b) == (a*a) + (c*c)){
                System.out.println("This is an right angle Triangle");
            }else{
                System.out.println("It is not an right angle Triangle");
            }

        }
        else if(c==max){
            if((c*c) == (a*a) + (b*b)){
                System.out.println("This is an right angle Triangle");
            }else{
                System.out.println("It is not an right angle Triangle");
            }
        }
    }
}
