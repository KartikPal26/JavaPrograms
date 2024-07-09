import java.util.Arrays;
import java.util.Scanner;

public class Sumof1dArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1,2,3,4,5,6};
        int[] ans = new int[arr.length];
        int sum =0;

        for(int i =0; i<=arr.length-1;i++){
            sum = sum+arr[i];
            ans[i]=sum;
        }
        System.out.println(Arrays.toString(ans));
    }
}
