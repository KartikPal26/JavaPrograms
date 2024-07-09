import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums ={1,2,1};
        int[] ans = new int[2*nums.length];
        int pos=0;
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
            pos++;
        }
        for(int i=0;i< nums.length;i++){
            ans[pos] = nums[i];
            pos++;
        }
        System.out.println(Arrays.toString(ans));

    }
}
