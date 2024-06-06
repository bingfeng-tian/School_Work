public class m1{
    public static boolean is_prime(int n){
        int c = 0;
        for(int i = 2; i <= n; i++){
            if(n % i==0)c++;
        }
        if(c==1)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        int A[][] = {{10, 20, 30}, {22, 33, 44}, {13, 29, 31}};
        int i = 0, j = 0;
        //(a)
        while(i<A.length){
            j = 0;
            while(j<A[i].length){
                System.out.print(A[i][j]+" ");
                j++;
            }
            i++;
        }
        //(b)
        System.out.print("\n所有質數：");
        int sum = 0;
        i=0;
        do{
            j=0;
            do{
                if(is_prime(A[i][j])){
                    System.out.print(A[i][j]+" ");
                    sum+=A[i][j];
                }
                j++;
            }while(j<A[i].length);
            i++;
        }while(i<A.length);
        //(c)
        System.out.print("\n所有質數的和："+sum);
    }
}