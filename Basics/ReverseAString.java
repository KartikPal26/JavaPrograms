import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s =  "Geeks for Geeks";

//        String rev = "";
//        for(int i =0;i<=s.length()-1;i++) {rev = s.charAt(i)+ rev;}
//        System.out.println(rev);

        StringBuilder rev = new StringBuilder();
        rev.append(s);
        rev.reverse();
        System.out.println(rev);

    }
}
