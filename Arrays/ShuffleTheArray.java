import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {2,5,1,3,4,7};
        int n= nums.length/2;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] x= new int[n];
        int[] y= new int[n];
        int count=0;

        for(int i=0;i<n;i++){
            x[i]=nums[i];
            count++;
        }
        for(int i=0;i<n;i++){
            y[i]=nums[i+count];
        }
        int i=0,j=0,k=0;
        while(i<x.length&&j<y.length){
            nums[k++]=x[i++];
            nums[k++]=y[j++];
        }
        return nums;
    }
}
