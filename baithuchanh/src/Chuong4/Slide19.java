package Chuong4;
import java.util.ArrayList;
import java.util.Iterator;
public class Slide19 {
    public static void main(String[] args) {
        ArrayList<Float> arrListFloat = new ArrayList<>();
        arrListFloat.add(0.7f);
        arrListFloat.add(7.26f);
        arrListFloat.add(1.02f);
        arrListFloat.add(9.3f);
        Iterator<Float> iterator = arrListFloat.iterator();
        System.out.println("cac phan tu co trong arrlistFloat la: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
    }
}
