class Drive{    //硬碟
    private int capacity = 0;   //容量 默認GB 為單位
    private String ITF = "";    //傳輸介面 例如：SATA、PCIE、M.2

    public Drive(){
        this.capacity = 120;
        this.ITF = "SATA";
    }
    public Drive(int c, String itf){
        this.capacity = c;
        this.ITF = itf;
    }
    
    public void show(){
        System.out.println("Capacity " + capacity);
        System.out.println("ITF " + ITF);
    }
}

class Nice_SSD extends Drive{
    private double price = 0;

    public Nice_SSD(double p, int c, String itf){
        super(c,itf);
        this.price = p;
    }

    public void show(){
        super.show();
        System.out.println("Price "+this.price);
    }
}

public class ex12_4{
    public static void main(String[] args){
        Nice_SSD Nice_SSD_obj = new Nice_SSD(800, 500, "M.2");
        Nice_SSD_obj.show();
    }
}