public class m2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String poke_number[]={"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
        String poke_color[] = {"梅花", "菱形", "愛心", "黑桃"};
		//int num=0;
		for(int i =0; i<13 ; i++) {
			for(int j=0;j<4;j++) {
				System.out.printf("%s%s ",poke_color[j],poke_number[i]);
			}
			System.out.println();
		}
		System.out.println("\n牌面為偶數的牌：");
		for(int i =0; i<13 ; i++) {
			for(int j=0;j<4;j++) {
				if ((i+1)%2==0)
					System.out.print(poke_color[j]+poke_number[i]+" ");
			}
			if ((i+1)%2==0)
				System.out.println();
		}
	}

}
