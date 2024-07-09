import java.util.Arrays;
import java.util.Scanner;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[]nums = {1,2,3,4,0};
        int[]index = {0,1,2,3,0};
//        nums = [1,2,3,4,0], index = [0,1,2,3,0]
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[index[i]]=(nums[i]);
        }
        return res;
    }

}
