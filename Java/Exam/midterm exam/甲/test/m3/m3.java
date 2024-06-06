import java.util.Scanner;

public class m3 {
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
        
        int n = day_counter(year, month, date);
        System.out.println("過了 "+n+"天");
        
        //(c)
        switch (n % 7) {
            case 0:
                System.out.println("這天是星期六\n");
                break;
            case 1:
                System.out.println("這天是星期日\n");
                break;
            case 2:
                System.out.println("這天是星期一\n");
                break;
            case 3:
                System.out.println("這天是星期二\n");
                break;
            case 4:
                System.out.println("這天是星期三\n");
                break;
            case 5:
                System.out.println("這天是星期四\n");
                break;
            case 6:
                System.out.println("這天是星期五\n");
                break;
        }
        
        //(d)
        int saturdays = 0;
        for (int d = 1; d <= get_day(month, year); d++) {
            int days = day_counter(year, month, d);
            if ((days + 6) % 7 == 0) saturdays++;
        }
        System.out.print(year+"年"+month+"月 共有 "+saturdays+" 個星期六");
    }
    
    //(b)
    public static int day_counter(int year, int month,int date){
        int n = 0;
        for(int y = 2000; y < year; y++){
            if(is_ry(y))
                n += 366;
            else
                n += 365;
        }
        for(int m = 1; m < month; m++){
            n += get_day(m, year);
        }
        n += date - 1;
        return n;
    }
    
    public static int get_day(int month, int year){
        switch (month) {
            case 2:
                if(is_ry(year))
                    return 29;
                else
                    return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
    
    public static boolean is_ry(int y){
        if((y-2000) % 4 == 0)
            return true;
        else
            return false;
    }
}