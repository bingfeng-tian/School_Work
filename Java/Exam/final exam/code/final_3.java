class spoon implements circle, stick{
        double radius = 0;
        int length = 0;
        public spoon(double r, int l){
            this.length = l;
            this.radius = r;
        }
        public void setRadius(double r){
            this.radius = r;
        }
        public double getRadius(){
            return this.radius;
        }
        public void setLength(int l){
            this.length = l;
        }
        public int getLength(){
            return this.length;
        }
    }
public class final_3{
    
    public static void main(String[] args){
        spoon spoon_obj = new spoon(1, 5);
        double total = spoon_obj.getRadius()*2+spoon_obj.getLength();
        System.out.println(total);
    }
}