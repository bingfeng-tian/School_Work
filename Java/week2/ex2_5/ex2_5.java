import java.util.Scanner;

public class ex2_5{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int a, b;
        System.out.print("請輸入第一個整數：");
        a = scn.nextInt();
        System.out.print("請輸入第二個整數：");
        b = scn.nextInt();
        System.out.println("兩整數的和: "+(a+b));
        System.out.println("兩整數的積: "+(a*b));
    }
}