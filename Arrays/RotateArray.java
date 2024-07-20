import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        rotate(new int[] {1,2,3,4,5,6,7} ,3);
    }
    public static void rotate(int[] nums, int k) {
        int[] temp= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[(i+k)%nums.length]=nums[i];
        }
        nums=temp;
        System.out.println(Arrays.toString(nums));
    }
}
