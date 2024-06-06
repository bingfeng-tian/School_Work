public class ex3_2 {
    public static void main(String args[]){
        int a = 10, b = 20;
        System.out.println(a*=b);
        System.out.println(b+=a);
        System.out.println(a/=5);
        System.out.println(b%=10);
        System.out.println(a%=--b);
    }
}
