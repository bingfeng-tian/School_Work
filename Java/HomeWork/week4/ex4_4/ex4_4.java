import java.util.Scanner;

public class ex4_4{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int password = 1234;
        int n, c = 1;
        System.out.print("請輸入密碼: ");
        n = scn.nextInt();
        while(n!=password){
            System.out.println("密碼錯誤，請再試一次\n");
            if(c<5){
                System.out.print("請輸入密碼: ");
                n = scn.nextInt();
                c++;
            }
            else{
                System.out.println("密碼輸入五次皆不正確，驗證失敗！");
                break;
            }
        }
        if(n==password){
            System.out.println("驗證成功");
        }
        scn.close();
    }
}