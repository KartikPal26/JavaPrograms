import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(transpose(mat)));
    }
    public static int[][] transpose(int[][] matrix) {
        int temp=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=matrix[j][i];
            }
        }
        return mat;
    }
}
