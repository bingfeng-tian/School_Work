import java.util.Scanner;

public class ex3_3{
    public static void main(String ards[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入攝氏溫度：");
        int n = scn.nextInt();
        System.out.println("華氏溫度："+(n*9/5+32));
        scn.close();
    }
}