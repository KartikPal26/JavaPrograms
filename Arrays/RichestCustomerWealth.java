import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] accounts = {{1,2,3},{3,2,1}};

        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int r =accounts.length-1;
        int c = accounts[0].length-1;

        int max =0;
        for(int i=0;i<=r;i++){
            int sum =0;
            for(int j=0;j<=c;j++){
                sum += accounts[i][j];
            }
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }

}
