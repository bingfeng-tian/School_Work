public class ex6_3{
    public static void main(String[] args){
        int arr[][] = {{10, 20, 30, 40},
                       {9, 11, 13, 15},
                       {-2, -4, -6, -8}};
        array_min(arr);
    }
    public static void array_min(int[][] arr){
        int min = arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.printf("%2d ",arr[i][j]);
                if(arr[i][j]<min)min=arr[i][j];
            }
            System.out.println();
        }
        System.out.println("min value: "+min);
    }
}