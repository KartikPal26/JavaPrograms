import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] n={2,1,5};
        int k = 806;
        System.out.println(addToArrayForm(n,k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        List<Integer> a = new ArrayList();
        int carry = 0;
        while (--n >=0||k>0) {
            if(n>=0)
                carry=k+num[n];
            else
                carry=k;
            a.add(carry%10);
            k=carry;
            k/=10;
        }
        return a.reversed();
    }
}
