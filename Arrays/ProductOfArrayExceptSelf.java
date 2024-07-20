import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[] {1,2,3,4})));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans =new int[n];
        int[] left=new int[n];
        int[] right=new int[n];
        int pro=1;
        left[0]=1;
        for(int i=1;i<=n-1;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            ans[i]=right[i]*left[i];
        }
        return ans;
    }
}
