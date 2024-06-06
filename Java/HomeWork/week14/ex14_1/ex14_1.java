interface Drink{
    abstract void show();
}

class lemon implements Drink{
    int sugar_level = 0;    //甜度
    int ice_level = 0;      //冰塊
    String size = "";       //大 中 小
    String variants = "";   //飲料名稱
    
    public lemon(){
        this.sugar_level = 3;
        this.ice_level = 5;
        this.size = "large";
        this.variants = "lemon tea";
    }

    public void show(){
        System.out.println("sugar level "+this.sugar_level);
        System.out.println("ice level "+this.ice_level);
        System.out.println("size "+this.size);
        System.out.println("variants "+this.variants);
    }
}

public class ex14_1{
    public static void main(String[] args){
        lemon lemon_obj = new lemon();
        lemon_obj.show();
    }
}