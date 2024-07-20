import java.util.Arrays;

public class FindFirstAndLastElementOfArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[] {} ,0)));
    }public static int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                arr[0]=i;
                break;
            }else{
                arr[0]=-1;
            }
        }for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                arr[1]=i;
                break;
            }else{
                arr[1]=-1;
            }
        }
        if(nums.length==0&&target==0){
            return new int[] {0,0};
        }
        return arr;
    }
}
