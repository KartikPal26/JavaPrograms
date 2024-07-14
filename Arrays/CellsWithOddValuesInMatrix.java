public class CellsWithOddValuesInMatrix {
    public static void main(String[] args) {
        int arr[][]={{0,1},
                {1,1}};
        System.out.println(oddCells(2,3,arr));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        for (int k = 0; k < indices.length; k++) {
            int[] e = indices[k];
            int r = e[0], c = e[1];
            for (int i = 0; i < m; ++i) {
                ans[i][c]++;
            }
            for (int j = 0; j < n; ++j) {
                ans[r][j]++;
            }
        }
        int an = 0;
        for (int[] row : ans) {
            for (int v : row) {
                an += v % 2;
            }
        }
        return an;
    }

}
