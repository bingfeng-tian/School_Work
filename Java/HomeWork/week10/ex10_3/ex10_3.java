class CTP //正三角柱體
{
	private int equal_triangle = 0; //正三角形邊長
	private int length = 0;         //柱體長度
    public CTP()
    {
        this(10,10);
    }
    public CTP(int equal_triangle, int length)
    {
        this.equal_triangle = equal_triangle;
        this.length = length;
    }
    public void triangle_area()
    {
        double high = this.equal_triangle / 2 * 1.732;
        System.out.println("triangle area "+(this.equal_triangle * high / 2));
    }
    public void show()
    {
        System.out.println("triangle "+this.equal_triangle);
        System.out.println("length "+this.length);
    }
}
public class ex10_3
{
    public static void main(String[] args)
    {
        CTP[] CTP_arr = new CTP[2];
        CTP_arr[0] = new CTP();
        CTP_arr[1] = new CTP(30,20);
        for(int i = 0; i < 2; i++)
        {
            CTP_arr[i].show();
            CTP_arr[i].triangle_area();
            System.out.println();
        }
    }
}