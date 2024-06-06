public class ex4_2{
    public static void main(String args[]){
        System.out.print("可以被 17 整除的數值:");
        for(int i = 1; i <= 100; i++){
            if(i%17==0)System.out.print(" "+i);
        }
    }
}