import java.util.Arrays;
import java.util.Scanner;

public class NumSmallerThanCurrentNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {8,1,2,2,3};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int c =0;
        for(int i=0;i<nums.length;i++){
            c=0;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]>nums[j] ){
                    c++;
                }
            }
            res[i]=c;
        }
        return res;
    }
}
