import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat=  {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(matrixReshape(mat,4,1)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c!=mat.length*mat[0].length)
            return mat;
        int[][] arr= new int[r][c];
        int pos=0;
        int[] arr2=new int[mat.length*mat[0].length];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                arr2[pos++]=mat[i][j];
            }
        }
        pos=0;
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=arr2[pos++];
            }
        }
        return arr;
    }
}
