import java.util.ArrayList;
import java.util.Scanner;

public class Slide23 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("nhap so phan tu cua arrlist: ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("nhap phan tu thu "+i+": ");
            number=sc.nextInt();
            arrListInteger.add(number);
        }
        int max=arrListInteger.get(0);
        for (int i=0;i<arrListInteger.size();i++){
            if ( arrListInteger.get(i).compareTo(max)>0){
                max=arrListInteger.get(i);
            }
        }
        System.out.println("phan tu lon nhat trong arrlistinteger ="+ max);
    }
    
}
