public class ex11_3{
    public ex11_3(){
        System.out.println("class ex11_3");
        CCone CCone_obj = new CCone(10,10);
        CCone_obj.show();
        System.out.println(CCone_obj.volume());
    }
    public static void main(String[] args){
        ex11_3 obj = new ex11_3();
    }
    //圓錐
    class CCone{
        private static double pi = 3.14;
        private int radius = 0;     //半徑
        private int height = 0;     //高
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
}