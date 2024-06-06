class Ctest
{
    int a;
    int b;
    int c;
}
public class ex7_1{
    public static int fab(int n){
        if(n == 0){
            return 1;
        }
        else  return n * fab(n-1);
    }    
    public static void main(String args[]){
        Ctest Ctest = new Ctest();
        Ctest.a = 10;
        Ctest.b = 15;
        Ctest.c = fab(Ctest.a) + fab(Ctest.b);
        System.out.print(Ctest.a+"\n"+Ctest.b+"\n"+Ctest.c);
    }
}