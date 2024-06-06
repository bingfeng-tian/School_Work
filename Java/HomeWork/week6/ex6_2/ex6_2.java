import java.util.Scanner;

public class ex6_2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入名字(英文): ");
        String name = scn.next();
        System.out.print("請輸入生日(年月日8位數字): ");
        int bt = scn.nextInt();
        basic_info(name,bt);
        scn.close();
    }
    public static void basic_info(String name, int bt){
        System.out.printf("name: %s  birthday: %d",name,bt);
    }
}