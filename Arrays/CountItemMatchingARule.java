import java.util.List;
import java.util.Scanner;

public class CountItemMatchingARule {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count =0;
        for (List<String> item : items) {
            int j;
            if (ruleKey.equals("type")) {
                j = 0;
                if (item.get(j).equals(ruleValue)) {
                    count++;
                }
            }
            if (ruleKey.equals("color")) {
                j = 1;
                if (item.get(j).equals(ruleValue)) {
                    count++;
                }
            }
            if (ruleKey.equals("name")) {
                j = 2;
                if (item.get(j).equals(ruleValue)) {
                    count++;
                }
            }

        }
        return count;
    }
}
