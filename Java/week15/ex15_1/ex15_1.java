interface Flour_food{}
interface Bread extends Flour_food {
    abstract String toString();
}
class Bagel implements Bread {
    public String toString() {
        return "Bagel";
    }
}
class Dount implements Bread {
    public String toString() {
        return "Dount";
    }
}
class Breakfast {
    Bread plate[] = new Bread[3];
    int count = 0;
    void Order(Bread b) {
        this.plate[count] = b;
        this.count++;
    }
    void show() {
        for(int i=0; i<count; i++) {
            System.out.println(plate[i]);
        }
    }
}
public class ex15_1 {
    public static void main(String[] args) {
        Breakfast Breakfast_obj = new Breakfast();
        Bagel Bagel_obj = new Bagel();
        Dount Dount_obj = new Dount();
        Breakfast_obj.Order(Bagel_obj);
        Breakfast_obj.Order(Bagel_obj);
        Breakfast_obj.Order(Dount_obj);
        Breakfast_obj.show();
    }
}
