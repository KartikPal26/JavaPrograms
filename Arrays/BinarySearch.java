public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        System.out.println(binaryLinear(arr, 5));
    }
    static int binaryLinear(int[] arr, int target){
        int s=0;
        int e=arr.length-1;
        if(arr[s]<arr[e]){
            while(s<=e){
                int m = s + (e-s)/2;
                if(arr[m]>target){
                    e=m-1;
                }else if(arr[m]<target){
                    s=m+1;
                }else{
                    return m+1;
                }
            }
        }
        else{
            while(s<=e){
                int m = s + (e-s)/2;
                if(arr[m]<target){
                    e=m-1;
                }else if(arr[m]>target){
                    s=m+1;
                }else{
                    return m;
                }
            }
        }
        return -1;
    }
}
