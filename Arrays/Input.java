import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] =23;
        arr[1] =231;
        arr[2] =232;
        arr[3] =233;
        arr[4] =234;
        System.out.println(arr[3]);

        for (int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println();
//
//        for(int num : arr){
//            System.out.print(num+" "); // here num represents the element of the array
//        }

//        System.out.println(arr[5]); // index out of bound error













    }
}
