import java.util.Arrays;

public class NUniqueIntegerSumUptoZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }
    public static int[] sumZero(int n) {
        int[] arr= new int[n];
        arr[0]=0;
        int x=1;
        for(int i=1;i<arr.length;i++){
            arr[i]=x;
            i++;
            arr[i]=-x;
            x++;
        }
        return arr;
    }
}
class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int sum = 0;

        for (int i = 0; i < n-1; i++) {
            result[i] = i+1;
            sum += result[i];
        }
        result[n - 1] = -1 * sum;
        return result;
    }

}
