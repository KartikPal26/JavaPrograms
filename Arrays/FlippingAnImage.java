import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] flipAndInvertImage = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println(Arrays.toString(flipAndInvertImage(flipAndInvertImage)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int temp=0;

        for(int i=0;i<image.length;i++){
            int n = image.length-1;
            for(int j=0;j<(image.length)/2;j++){
                temp = image[i][j];
                image[i][j]= image[i][n];
                image[i][n]=temp;
                n--;
            }
            for(int j=0;j<image.length;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }else{
                    image[i][j]=0;
                }
                System.out.print(image[i][j]);
            }
            System.out.println();

        }
        return image;
    }

}
