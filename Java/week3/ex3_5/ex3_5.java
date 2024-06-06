import java.util.Scanner;

public class ex3_5 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("天數：");
        int n = scn.nextInt();
        System.out.println("周："+(n/7));
        System.out.println("天："+(n%7));
        scn.close();
    }
}
