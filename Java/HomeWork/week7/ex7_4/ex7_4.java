class Cman{
    private String name;
    private int height;
    void set_man(String n,int h){
        this.name = n;
        this.height = h;
    }
    void set_man(String n){
        set_man(n,this.height);
    }
    void set_man(int h){
        set_man(this.name,h);
    }
    void show(){
        System.out.print("name "+this.name+" height "+this.height);
    }
}
public class ex7_4{
    public static void main(String args[]){
        Cman c1 = new Cman();
        c1.set_man("Tom");
        c1.set_man(175);
        c1.set_man("Ben", 168);
        c1.show();
    }
}