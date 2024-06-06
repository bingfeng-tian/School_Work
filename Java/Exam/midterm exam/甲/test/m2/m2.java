public class m2 {
    public static void main(String[] args){
        String poke_number[]={"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
        String poke_color[] = {"梅花", "菱形", "愛心", "黑桃"};
        //(a)
        for(int i = 0;i < 13;i++){
            for(int j=0;j<4;j++){
                System.out.print(poke_color[j]+poke_number[i]+" ");
            }
            System.out.print("\n");
        }
        //(b)
        System.out.print("\n牌面為偶數的牌：\n");
        for(int i =1;i < 13;i+=2){
            for(int j=0;j<4;j++){
                System.out.print(poke_color[j]+poke_number[i]+" ");
            }
            System.out.print("\n");
        }
    }
}
