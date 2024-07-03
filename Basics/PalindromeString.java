import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palindrome = in.next();
        int l = palindrome.length()-1;
        for(int i=0;i<(palindrome.length()/2)-1;i++){
            if(palindrome.charAt(i)!=palindrome.charAt(l)){
                System.out.println("Not palindrome");
                break;
            }else{
                System.out.println("palindrome");
            }
            l--;
        }
    }
}
