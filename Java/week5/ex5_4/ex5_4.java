public class ex5_4{
    public static void main(String[] args) {
        int D[][][] ={
            {{35, 10}, {130}, {90}}, // 第1天
            {{30, 25}, {85}, {75}},  // 第2天
            {{55}, {100}, {80, 45}}  // 第3天
            };
        int[] d = new int[3];
        int total = 0;
        for(int i=0,n=0;i<D.length;i++,n=0){
            for(int j=0;j<D[i].length;j++){
                for(int k=0;k<D[i][j].length;k++){
                    System.out.print(D[i][j][k]+" ");
                    n+=D[i][j][k];
                }
            }
            d[i] = n; 
            total+=n;
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<d.length;i++){
            System.out.printf("第 %d 天 花費 %d 元\n",i+1,d[i]);
        }
        System.out.printf("\n三天共花費 %d 元",total);
    }
}