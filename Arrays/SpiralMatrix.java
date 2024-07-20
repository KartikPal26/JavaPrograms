import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][] {{1},{2}}));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int top =0;
        int bottom = matrix.length;
        int left =0;
        int right =matrix[0].length;
        while(left<right&&top<bottom){
            for(int i=left;i<right;i++){
                list.add(matrix[top][i]);
            }
            top+=1;

            for(int j=top;j<bottom;j++){
                list.add(matrix[j][right-1]);
            }
            right-=1;
            if(!(left<right && top<bottom)){
                break;
            }

            for(int i=right-1;i>left;i--){
                list.add(matrix[bottom-1][i]);
            }
            bottom-=1;

            for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left+=1;
        }
        return list;
    }
}
