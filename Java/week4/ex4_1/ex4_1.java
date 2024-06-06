import java.util.Scanner;

public class ex4_1{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入一個正整數：");
        int n = scn.nextInt();
        if(n <= 0){
            System.out.println("輸入錯誤");
        }
        else{
            if(n % 2 == 0){
                System.out.println("偶數");
            }
            else{
                System.out.println("奇數");
            }
        }
        scn.close();
    }
}