public class ex5_3{
    public static void main(String[] args) {
        int C[][]={{1, 2}, {3, 4}};
        System.out.println("原陣列");
        for(int i=0;i<C.length;i++){
            for(int j=0;j<C[i].length;j++){
                System.out.printf("%2d ",C[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n平方後");
        for(int i=0;i<C.length;i++){
            for(int j=0;j<C[i].length;j++){
                System.out.printf("%2d ",C[i][j]*C[i][j]);
            }
            System.out.println();
        }
    }
}