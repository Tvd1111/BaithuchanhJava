package Chuong4;

import java.util.HashSet;
import java.util.Scanner;

public class Slide54 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashsetInteger = new HashSet<>();
        Scanner sc= new Scanner(System.in);
        hashsetInteger.add(0);
        hashsetInteger.add(3);
        hashsetInteger.add(1);
        hashsetInteger.add(4);
        hashsetInteger.add(2);
        hashsetInteger.add(8);
        System.out.println("cac phan tu trong hashsetInteger");
        System.out.println(hashsetInteger);
        System.out.println("nhap phan tu can them");
        number = sc.nextInt();
        if(!hashsetInteger.contains(number)){
            hashsetInteger.add(number);
            System.out.println("them thanh cong");
            System.out.println("cac phan tu trong hashsetinteger sau khi them:");
            System.out.println(hashsetInteger);
        }else{
            System.out.println("phan tu " +number+" da ton tai.");
        }
    }
}
