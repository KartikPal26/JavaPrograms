import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println((removeDuplicates(new int[] {1,1,2,2,2,2,3,3,3,4,5})));
    }
    public static int removeDuplicates(int[] nums) {
        int count=0;
        int size =1;
        int[] arr= new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[size]=nums[i+1];
                size++;
                count++;
            }
        }
        return count+1;
    }
}
