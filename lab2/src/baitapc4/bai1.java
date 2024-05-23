import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai1{
    public static void main(String[] args){
        ArrayList<Integer> arrlistint = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao so phan tu: ");
        int n = scanner.nextInt();
        System.out.println("nhap vao cac phan tu:");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            arrlistint.add(number);
        }
        int max = Collections.max(arrlistint);
        System.out.println("so nguyen lon nhat trong day la: " + max);
        System.out.print("nhap vao so nguyen de xoa: ");
        int deleteNumber = scanner.nextInt();
        arrlistint.removeIf(num -> num == deleteNumber);
        Collections.sort(arrlistint);
        System.out.println("day so sau khi xoa va sap xep:");
        for (int number : arrlistint) {
            System.out.print(number + " ");
        }
    }
}