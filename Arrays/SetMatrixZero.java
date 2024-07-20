import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        setZeroes(new int[][] {{1,1,1},{1,0,1},{1,1,1}});
    }public static void setZeroes(int[][] matrix) {
        int[][] matrix2=new int[matrix.length][matrix[0].length];
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                matrix2[i][j]=matrix[i][j];
            }
        }for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                if(matrix[i][j]==0){
                    int k=0;
                    while(k<matrix.length){
                        matrix2[k][j]=0;
                        k++;
                    }

                    int l=0;
                    while(l<matrix[i].length){
                        matrix2[i][l]=0;
                        l++;
                    }

                }
            }
        }

        System.out.println(Arrays.deepToString(matrix2));
    }
}
