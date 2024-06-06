public class ex4_3{
    public static void main(String args[]){
        int i = 1;
        do{
            int j = 1;
            do{
                System.out.printf("%d x %d =%<3d  ", j, i, i*j);
                j++;
            }while(j < 10);
            System.out.println();
            i++;
        }while(i < 10);
    }
}