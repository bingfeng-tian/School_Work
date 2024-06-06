public class ex5_2 {
    public static void main(String[] args){
        int B[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("B 陣列的長度為 "+B.length);
        for(int i:B){
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.printf("%2d 月共有 %2d 天\n",i,31);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.printf("%2d 月共有 %2d 天\n",i,30);
                    break;
                case 2:
                    System.out.printf("%2d 月共有 %2d 天\n",i,28);
                    break;
            }
        }
    }
}