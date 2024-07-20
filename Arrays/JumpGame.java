public class JumpGame {
    public static void main(String[] args) {
        System.out.println(canJump(new int[] {1,2,3}));
    }
    public static boolean canJump(int[] nums) {
        int goal =nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=goal){
                goal=i;
            }
        }
        return goal==0;
    }
}
