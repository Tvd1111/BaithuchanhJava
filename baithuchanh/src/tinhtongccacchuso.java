import java.util.Scanner;

public class tinhtongccacchuso {
     public static int sum (int a ){
        if (a<10) return a;
        return sum(a/10)+sum(a%10);
    }
public static void main(String[] args) {
     int a;
     int tong;
    Scanner sc = new Scanner(System.in);
    System.out.println(" nhap so nguyen duong a: ");
    a= sc.nextInt();
    tong = sum(a); 
    System.out.println("tong cac chu so la:" + tong); 
       }
}
