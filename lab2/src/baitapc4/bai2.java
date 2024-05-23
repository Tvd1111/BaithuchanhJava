import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat tbc = new DecimalFormat();
        LinkedList<Integer> baiso2LinkedList = new LinkedList<>();
         int n , m , sum = 0 , count = 0;
         float tbcong;
         System.out.print("Nhap vao so phan tu cua danh sach :");
         n = sc.nextInt();
        System.out.println("nhap gia tri cua cac phan tu trong danh sach :");
      
        for(int i = 0; i < n ; i++) {
            System.out.print("Nhap vao phan tu thu " + i + " : ");
            m = sc.nextInt();
            baiso2LinkedList.add(m);
        }
        for (int i = 0; i<n; i++){
            if (baiso2LinkedList.get(i) % 2 == 0){
                sum += baiso2LinkedList.get(i);
                count++;
            }
        }
        tbcong = (float)sum/count;
        System.out.println("Trung binh cua cac so chan co trong ds = " + tbc.format(tbcong));

    }
}