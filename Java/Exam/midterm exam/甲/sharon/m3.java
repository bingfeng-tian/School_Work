import java.util.Scanner;
public class m3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ,count=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("請輸入年: ");
		int year =scanner.nextInt();
		System.out.print("請輸入月: ");
		int month =scanner.nextInt();
		System.out.print("請輸入日: ");
		int date =scanner.nextInt();
		num=day_counter(year,month,date);
		scanner.close();
		day_week((num%7));
		System.out.println();
		
		int nu=0 , cou=0 ;
		nu= ( (year-2000)*365 ) +( ((year-2000)/4)+1 ) ;
		
		for (int i =1 ; i<month;i++) {
			cou+=dat_month(i);
		}
		if ((month>2)&&((year-2000)%4==0))
			cou+=1;
		nu+=cou;
		nu-=1;
		
		for (int i=nu;i<=nu+dat_month(month);i++) {
			if(i%7==0) {
				count+=1;
			}
		}
		System.out.println(year+"�~"+month+"�� �@�� "+count+" �ӬP����");
	}

	private static void day_week(int key) {
		switch (key) {
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
		case 0:
			System.out.println("這天是星期六");
			break;
		case 1:
			System.out.println("這天是星期日");
			break;
		}
	}

	private static int day_counter(int year, int month,int date) {
		int num=0 , count=0 ;
		num= ( (year-2000)*365 ) +( ((year-2000)/4)+1 ) ;
		
		for (int i =1 ; i<month;i++) {
			count+=dat_month(i);
		}
		if ((month>2)&&((year-2000)%4==0))
			count+=1;
		num+=count;
		num+=date;
		num-=1;
		System.out.println("�L�F "+num+"��");		
		return num;
	}

	private static int dat_month(int month) {
		// TODO Auto-generated method stub
		int count=0;
		switch (month) {
		case 1:
			count=31;
			break;
		case 2:
			count=28;
			break;
		case 3:
			count=31;
			break;
		case 4:
			count=30;
			break;
		case 5:
			count=31;
			break;
		case 6:
			count=30;
			break;
		case 7:
			count=31;
			break;
		case 8:
			count=31;
			break;
		case 9:
			count=30;
			break;
		case 10:
			count=31;
			break;
		case 11:
			count=30;
			break;
		case 12:
			count=31;
			break;
		}
		return count;
	}

}
