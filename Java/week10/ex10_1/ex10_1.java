class CTP //正三角柱體
{
	private int equal_triangle = 0; //正三角形邊長
	private int length = 0;         //柱體長度
    public CTP()
    {
        this.equal_triangle = 10;
        this.length = 10;
    }
    public void show()
    {
        System.out.println("triangle "+this.equal_triangle);
        System.out.println("length "+this.length);
    }
}

public class ex10_1
{
    public static void main(String[] args)
    {
        CTP CTP_obj = new CTP();
        CTP_obj.show();
    }
}