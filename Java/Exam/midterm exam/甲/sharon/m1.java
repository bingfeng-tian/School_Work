public class m1 {
	public static void main(String[] args) {
		int A[][] = {{10, 20, 30}, {22, 33, 44}, {13, 29, 31}};
		int n=0,u=0 , num=0;
		while (n<A.length) {
			for (int i=0;i<A[n].length;i++) {
				System.out.print(A[n][i]+" ");
			}
			n++;
		}
		System.out.println();
		System.out.print("�Ҧ����: ");
		do {
			for (int i=0;i<A[u].length;i++) {
				if (pic(A[u][i])==2) {
					System.out.print(A[u][i]+" ");
					num+=A[u][i];
				}
			}
			u++;
		} while (u<A.length);
		System.out.println("\n�Ҧ���ƩM: "+num);
	}

	private static int pic(int a) {
		// TODO Auto-generated method stub
		int num=0;
		for(int i =1;i<=a;i++) {
			if (a%i==0) {
				num++;
			}
		}
		return num;
	}
	
}
