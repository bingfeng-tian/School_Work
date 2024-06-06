public class m2{
    public static void main(String[] args){
        //(a)
        String poke_number[]={"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
        //(b)
        String poke_color[] = {"梅花", "菱形", "愛心", "黑桃"};
        //(c)
        for(int i=0; i<13; i++){
            for(int j=0; j<4; j++){
                System.out.print(poke_color[j]+poke_number[i]+" ");
            }
            System.out.println();
        }
        //(d)
        System.out.println("\n牌面為奇數的牌：");
        for(int i=0; i<13; i+=2){
            for(int j=0; j<4; j++){
                System.out.print(poke_color[j]+poke_number[i]+" ");
            }
            System.out.println();
        }
    }
}