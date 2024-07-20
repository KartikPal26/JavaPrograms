public class MaximumSubArray {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        int max = 0;
        int curmax=0;
        for(int i=0;i< nums.length;i++){
            curmax+=nums[i];
            if(curmax>max){
                max=curmax;
            }
            if(curmax<0){
                curmax=0;
            }

        }

        return max;
    }
}
