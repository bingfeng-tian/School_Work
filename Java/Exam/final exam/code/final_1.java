interface circle{
    final double pi = 3.14;
    abstract void setRadius(double r);
    abstract double getRadius();
}

public class final_1{
    static class lifebuoy implements circle{
        double radius = 0;
        double mass = 0;
        public lifebuoy(){
            this.radius = 30;
            this.mass = 3;
        }
        public void setRadius(double r){
            this.radius = r;
        }
        public double getRadius(){
            return this.radius;
        }
        public void show(){
            System.out.println("Perimeter " + (2*this.radius*pi) + " cm");
            System.out.println(this.radius + " cm");
            System.out.println(this.mass + " kg");
        }
    }
    public static void main(String[] args){
        lifebuoy lifebuoy_obj = new lifebuoy();
        lifebuoy_obj.show();
    }
}