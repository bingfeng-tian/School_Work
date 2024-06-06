public class ex5_1{
    public static void main(String[] args){
        int A[] = {31, 22, 65, 10, 83, 76};
        int odd = 0, even = 0;  //奇數、偶數
        int max_odd = 0, max_even = 0; 
        System.out.print("陣列 A 內容:");
        for(int i = 0; i < A.length; i++){
            if(A[i]%2==1){
                if(A[i]>max_odd)max_odd=A[i];
                odd++;
            }
            else{
                if(A[i]>max_even)max_even=A[i];
                even++;
            }
            System.out.print(" "+A[i]);
        }
        System.out.println("\n奇數有："+odd+"個 偶數有："+even+"個");
        System.out.println("最大的奇數為："+max_odd+" 最大的偶數為："+max_even);
    }
}