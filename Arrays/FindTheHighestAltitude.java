import java.util.Arrays;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int[] sum= new int[gain.length+1];
        sum[0] =0;
        int max =sum[0];
        for(int i=1;i<gain.length+1;i++){
            sum[i] =sum[i-1]+gain[i-1];
            if(max<sum[i]){
                max = sum[i];
            }
        }
        
        return max;
    }
}
