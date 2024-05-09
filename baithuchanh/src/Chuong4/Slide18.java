package Chuong4;
import java.util.ArrayList;
public class Slide18 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInterger = new ArrayList<>();
        arrListInterger.add(0);
        arrListInterger.add(7);
        arrListInterger.add(1);
        arrListInterger.add(9);
        System.out.println("cac phan tu co trong arrListInteger la: ");
        for (int number : arrListInterger){
            System.out.print(number +"\t");
        }
    }
}
