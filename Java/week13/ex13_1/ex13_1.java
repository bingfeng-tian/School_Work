abstract class CContact_lens{ //隱形眼鏡
    
    protected double diameter=0;        //直徑
    protected double base_curve=0;      //孤度
    protected String diopters = "";     //度數
    
    public void setValue(double dia , double bc, String d) {
        this.diameter= dia;
        this.base_curve = bc;
        this.diopters = d;
    }
    public abstract void show();
}
class CLens extends CContact_lens{
    protected String EXP = "";
    public CLens(){
        super.setValue(14, 8.0, "-2.00");
        EXP = "2023/3/15";
    }
    public CLens(String exp, double dia, double bc, String d){
        super.setValue(dia, bc, d);
        EXP = exp;
    }
    public void show(){
        System.out.println("DIA " + this.diameter);
        System.out.println("B.C " + this.base_curve);
        System.out.println("D " + this.diopters);
        System.out.println("EXP " + this.EXP);
    }
}
public class ex13_1{
    public static void main(String[] args) {
        CLens CLens_obj1 = new CLens();
        CLens_obj1.show();
        System.out.println();
        CLens CLens_obj12 = new CLens("2024/10/22", 13, 8.7, "-1.25");
        CLens_obj12.show();
    }
}