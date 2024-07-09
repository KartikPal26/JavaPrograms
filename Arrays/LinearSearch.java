import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr ={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        String a = "hello";
        System.out.println(linearSearch(arr,5));

    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        for(int i:arr){
            if(arr[i]==target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
    static int linearSearch(String name,char target){
        for(int i = 0; i<name.length(); i++){
            boolean b = (name.charAt(i)) == (target);
            if(b){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
    static int linearSearch(int[][] arr,int target){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    System.out.println(i);
                    return j;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

}
