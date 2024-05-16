package Chuong4;

import java.util.Scanner;
import java.util.TreeSet;

public class Slide69 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treesetInteger= new TreeSet<>();
        Scanner sc= new Scanner(System.in);
        treesetInteger.add(0);
        treesetInteger.add(3);
        treesetInteger.add(1);
        treesetInteger.add(4);
        treesetInteger.add(2);
        treesetInteger.add(8);
        System.out.println("cac phan tu trong treeserInteger:");
        System.out.println(treesetInteger);
        System.out.println("cac phan tu can them:");
        number = sc.nextInt();
        if(treesetInteger.contains(number)){
            treesetInteger.add(number);
            System.out.println("them thanh cong");
            System.out.println("cac phan tu trong treesetInteger sau khi them");
            System.out.println(treesetInteger);
        }else{
            System.out.println("phan tu "+ number+"da ton tai");
        }
    }
}
