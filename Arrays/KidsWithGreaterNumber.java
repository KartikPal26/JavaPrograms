import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class KidsWithGreaterNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if ((candy + extraCandies) >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
