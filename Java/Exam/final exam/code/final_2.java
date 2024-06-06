interface stick{
    abstract void setLength(int l);
    abstract int getLength();
}
class chopstick implements stick{
        int length = 0;
        String material = "";
        boolean chopstick_rest = false;
        public chopstick(int l, String m, boolean cr){
            this.length = l;
            this.material = m;
            this.chopstick_rest = cr;
        }
        public void setLength(int l){
            this.length = l;
        }
        public int getLength(){
            return this.length;
        }
        public void show(){
            System.out.println(this.length);
            System.out.println(this.material);
            if(this.chopstick_rest)
                System.out.println("Please use chopstick rest");
            else
                System.out.println("N/A");
        }
    }
public class final_2{
    
    public static void main(String[] args){
        chopstick chopstick_obj = new chopstick(18, "iron", true);
        chopstick_obj.setLength(16);
        chopstick_obj.show();
    }
}