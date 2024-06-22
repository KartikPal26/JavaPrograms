import java.util.Arrays;

public class CharacterSearchingInString {
    public static void main(String[] args) {
        String a = "Kartik";
//        char target = 'e';
//        System.out.println(search2(a,target));
        System.out.println(Arrays.toString(a.toCharArray()));
    }
    static boolean search(String  str, char target){
        if (str.length() ==0){
            return false;
        }
        for(char ch =0; ch < str.length();ch++){
            if(target == str.charAt(ch)){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target){
        for(char ch :str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }

}
