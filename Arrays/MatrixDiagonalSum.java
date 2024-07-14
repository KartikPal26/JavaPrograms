public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] arr ={{1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}};
        System.out.println(diagonalSum(arr));
    }
    public static int diagonalSum(int[][] mat) {
        int sum =0;
        int n =mat.length-1;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j){
                    sum += mat[i][j];
                }
            }
            if(i!=n){
                sum+= mat[i][n];
            }
            n--;
        }
        return sum;
    }
    public int diagonalSum1(int[][] mat) {
        int sum =0;
        int m = mat.length;

        for(int i=0;i<m;i++)
        {
            int j= m-i-1;
            sum+=mat[i][i]+(i==j?0:mat[i][j]);
        }
        return sum;
    }
}
