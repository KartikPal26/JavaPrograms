public class LinearingSearching {
    public static void main(String[] args) {
        int[] n ={1,2,3,4,5,6};
        System.out.println(linearSearch2(n,));
    }
    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length ==0){
            return -1;
        }
//        run a for loop
        for (int index=0; index < arr.length; index++) {
//      check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return Integer.MAX_VALUE;
    }
    static int linearSearch2(int[] arr, int target){
        if (arr.length ==0){
            return -1;
        }
        for(int element:arr){
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    static boolean linearSearch3(int[] arr, int target){
        for(int element: arr){
            if(element == target){
                return true;
            }
        }
        return false;
    }

}



















