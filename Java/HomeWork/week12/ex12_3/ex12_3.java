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

class SSD extends Drive{
    public SSD(int c, String itf){
        super(c,itf);
        System.out.println("SSD");
    }
}

public class ex12_3{
    public static void main(String[] args){
        SSD SSD_obj = new SSD(500, "M.2");
        SSD_obj.show();
    }
}