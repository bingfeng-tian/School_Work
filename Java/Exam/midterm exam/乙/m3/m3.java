import java.util.Scanner;

public class m3{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //(a)
        System.out.print("請輸入年：");
        int year = scn.nextInt();
        System.out.print("請輸入月：");
        int month = scn.nextInt();
        System.out.print("請輸入日：");
        int date = scn.nextInt();
        scn.close();
        //(c)
        int n = day_counter(year,month,date);
        switch (n%7) {
            case 0:
                System.out.println("這天是星期六");
                break;
            case 1:
                System.out.println("這天是星期日");
                break;
            case 2:
                System.out.println("這天是星期一");
                break;
            case 3:
                System.out.println("這天是星期二");
                break;
            case 4:
                System.out.println("這天是星期三");
                break;
            case 5:
                System.out.println("這天是星期四");
                break;
            case 6:
                System.out.println("這天是星期五");
                break;
        }
        //(d)
        int before, after; //前面格子數, 後面格子數
        before = get_weekday(year, month, 1)*2;
        after = (6 - get_weekday(year, month, get_day(year,month)))*2;
        System.out.printf("\n前面需要 %d 格 後面需要 %d 格",before,after);
    }
    //(b)
    public static int day_counter(int year, int month,int date){
        int n = 0;
        for(int i=2000; i<year; i++){
            if((i-2000)%4==0)
                n += 366;
            else
                n += 365;
        }
        for(int i=1; i<month; i++){
            n += get_day(year, i);
        }
        n += date-1;
        System.out.println("過了 "+n+"天");
        return n;
    }
    //可決定是否印出結果的多載
    public static int day_counter(int year, int month,int date, boolean do_print){
        int n = 0;
        for(int i=2000; i<year; i++){
            if((i-2000)%4==0)
                n += 366;
            else
                n += 365;
        }
        for(int i=1; i<month; i++){
            n += get_day(year, i);
        }
        n += date-1;
        if(do_print)
            System.out.println("過了 "+n+"天");
        return n;
    }
    //取得當月的天數
    public static int get_day(int year,int month) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if((year-2000)%4==0)
                    return 29;
                else 
                    return 28;
            default:
                return 31;
        }
    }
    //取得當日星期幾
    public static int get_weekday(int y, int m, int d){
        int n = day_counter(y, m, d,false);
        switch (n%7) {
            case 0:
                return 6;
            case 1:
            default:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
        }
    }
}