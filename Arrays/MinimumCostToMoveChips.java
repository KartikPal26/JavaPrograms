import java.util.Arrays;

public class MinimumCostToMoveChips {
    public static void main(String[] args) {
        int[]arr= {1,2,2,3};
        System.out.println((minCostToMoveChips(arr)));
    }
    public static int minCostToMoveChips(int[] position) {
        int odd=0;
        int even=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        return Integer.min(odd,even);
    }
}
