import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,even,odd;
        even=0;
        odd=0;
        n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                even =even+arr[i];
            }else{
                odd = odd+arr[i];
            }
        }
        System.out.println(odd);
        System.out.println(even);
    }
}
