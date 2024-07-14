public class CountDigits {
    public static void main(String[] args) {
        int[] a={1,22,44,5};
        System.out.println(findNumbers(a));
    }
    public static int findNumbers(int[] nums) {
        int count =0;
        for (int i = 0; i <nums.length; i++) {
            int a= nums[i];
            int n=0;
            while(a!=0){
                a/=10;
                n++;
            }
            if(n%2==0){
                count++;
            }
        }
        return count;
    }
}
