import java.util.Arrays;

public class SpiralMatrixII {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(1)));
    }public static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int top=0;
        int bottom=ans.length;
        int left=0;
        int right=ans[0].length;
        int a =1;
        while(top<bottom&&left<right){
            for(int i=left;i<right;i++){
                ans[top][i]=a;
                a++;
            }
            top+=1;
            for(int i=top;i<bottom;i++){
                ans[i][right-1]=a;
                a++;
            }
            right-=1;
            if(!(left<right && top<bottom)){
                break;
            }
            for(int i=right-1;i>=left;i--){
                ans[bottom-1][i]=a;
                a++;
            }
            bottom-=1;
            for(int i=bottom-1;i>=top;i--){
                ans[i][left]=a;
                a++;
            }
            left++;
        }

        return ans;
    }
}
