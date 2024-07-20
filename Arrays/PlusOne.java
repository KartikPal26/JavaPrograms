import java.lang.reflect.Array;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] {9,8,7,6,5,4,3,2,1,0})));
    }
    public static int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            ++digits[i];
            digits[i]%=10;
            if(digits[i]!=0){
                return digits;
            }
        }
        digits=new int[n+1];
        digits[0]=1;
        return digits;
    }
}
