class Ccomputer
{
    String cpu;
    String gpu;
    int ram;
}
public class ex7_2{
    public static void main(String args[]){
        Ccomputer com1 = new Ccomputer();
        Ccomputer com2 = new Ccomputer();
        com1.cpu = "i7-8700";
        com1.gpu = "1660";
        com1.ram = 8;
        com2.cpu = "i5-12400";
        com2.gpu = "2620";
        com2.ram = 16;
        System.out.printf("com1 cpu: %s gpu: %s ram: %d\n",com1.cpu,com1.gpu,com1.ram);
        System.out.printf("com2 cpu: %s gpu: %s ram: %d\n",com2.cpu,com2.gpu,com2.ram);
    }
}