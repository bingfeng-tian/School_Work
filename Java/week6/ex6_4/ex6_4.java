import java.util.Scanner;

public class ex6_4{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入一正整數：");
        int n = scn.nextInt();
        if(n>0)
            System.out.print(factorial(n));
        scn.close();
    }
    public static int factorial(int i){
        int x = 1;
        for(int j=1;j<=i;j++){
            x*=j;
        }
        return x;
    }
}