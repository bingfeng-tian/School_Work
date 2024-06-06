//硬碟
class Drive{
    
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
public class ex12_1
{
    public static void main(String[] args)
    {
        Drive Drive_obj = new Drive();
        Drive_obj.show();
    }
}