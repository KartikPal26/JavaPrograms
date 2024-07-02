import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if(String.valueOf(s.charAt(0)).equals("a") || String.valueOf(s.charAt(0)).equals("e") || String.valueOf(s.charAt(0)).equals("i") || String.valueOf(s.charAt(0)).equals("o") || String.valueOf(s.charAt(0)).equals("u")){
            System.out.println("Vowel");

        }else{
            System.out.println("Consonant");
        }
    }
}
