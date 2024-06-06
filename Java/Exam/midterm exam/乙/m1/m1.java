public class m1{
    public static void main(String[] args){
        //(a)
        int A[][] = {{10, 20, 30}, {22, 33, 44}, {13, 29, 31}};
        int i = 0, j;
        //(b)
        do{
            j = 0;
            do{
                System.out.print(A[i][j]+" ");
                j++;
            } while(j<A[i].length);
            i++;
        }while(i<A.length);
        int sum = 0;
        //(c)
        System.out.print("\n所有質數：");
        i=0;
        while(i<A.length){
            j=0;
            while(j<A[i].length){
                if(is_prime(A[i][j])){
                    System.out.printf("%3d",A[i][j]);
                    sum+=A[i][j];
                }
                j++;
            }
            i++;
        }
        //(d)
        System.out.print("\n所有質數的和：");
        System.out.printf("%3d",sum);
    }
    public static boolean is_prime(int n){
        int c = 0;
        for(int i=2;i<=n;i++){
            if(n%i==0)c++;
        }
        if(c==1)
            return true;
        else
            return false;
    }
}