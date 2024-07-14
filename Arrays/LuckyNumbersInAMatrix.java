import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public static void main(String[] args) {
        System.out.println(luckyNumbers1(new int[][] {{1,10,4,2},
                {15,16,17,12}}));

    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> a= new ArrayList<>();
        int ln=0;
        int in=0;
        int min=matrix[0][0];
        for(int i=0;i< matrix.length;i++){
            Arrays.sort(matrix[i]);
        }
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]<min){
                min=matrix[i][0];
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]>ln){
                ln=matrix[i][0];
                in=i;
            }
        }
        for(int i=1;i<matrix[0].length;i++){
            if(matrix[in][0]>matrix[in][i]){
                ln=matrix[in][i];
            }
        }
        if(min!=ln){
            a.add(ln);
        }

        return a;
    }
    public static List<Integer> luckyNumbers1 (int[][] matrix) {
        ArrayList<Integer>list = new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            int min = Integer.MAX_VALUE;
            int col=0;
            for(int j=0;j<matrix[i].length;j++){
                if(min>matrix[i][j])  {
                    min=matrix[i][j];   // gives the min in a row.
                    col = j;    // column of the min value of that row
                }
            }

            boolean isTrue = true;

            for(int j=0;j<matrix.length;j++){
                if(matrix[i][col]<matrix[j][col]){
                    isTrue=false;
                    break;
                }
            }
            if(isTrue){
                list.add(matrix[i][col]);
            }

        }
        return list;
    }
}
