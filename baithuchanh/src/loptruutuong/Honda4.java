import slide79.main;

public class Honda4 extends Bike{
    public void run(){
        System.out.println("running safely..");
    }    
    public static void main(String[] args) {
        Bike obj = new Honda4();
        obj.run();
    }
}
