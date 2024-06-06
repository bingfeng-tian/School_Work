//圓錐
class CCone{
    public static double pi = 3.14;
    public int radius = 0;     //半徑
    public int height = 0;     //高

    public CCone(){
        this.radius = 5;
        this.height = 10;
    }
    
    public CCone(int r, int h){
        this.radius = r;
        this.height = h;
    }

    public void show(){
        System.out.println(this.radius);
        System.out.println(this.height);
    }

    public double volume(){
        return ((this.radius * this.radius) * pi * height)/3;
    }
}
public class ex11_4{
    public static void main(String[] args){
        double area = (
            new CCone()
            {
                double base_area(){
                    return this.pi * (this.radius * this.radius);
                }
            }
        ).base_area();
        System.out.print(area);
    }
}