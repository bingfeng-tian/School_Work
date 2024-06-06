class Cold{
    int num;
    int age;
    void set_value(int n,int a){
        this.num = n;
        this.age = a;
    }
    void show(){
        System.out.print("number "+this.num+" age "+this.age);
    }
}
public class ex7_3{
    public static void main(String args[]){
        Cold C1 = new Cold();
        C1.set_value(1,20);
        C1.show();
    }
}