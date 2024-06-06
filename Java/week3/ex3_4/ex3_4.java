import java.util.Scanner;
public class ex3_4{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入公里：");
        int n = scn.nextInt();
        System.out.println("英里："+(n*0.6214f));
        scn.close();
    }
}