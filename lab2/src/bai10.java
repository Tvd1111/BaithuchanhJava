import java.util.Scanner;

public class bai10 {
public static void main(String[] args) {
    String chuoi;
    char kyTu;
    int solan=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap vao chuoi bat ky:");
    chuoi = sc.nextLine();
    System.out.println("nhap vao ky tu can dem so lan xuat hien:");
    kyTu = sc.next().charAt(0);
    for(int i=1;i<chuoi.length();i++)
    if(kyTu == chuoi.charAt(i))
    solan++;
    System.out.println("so lan xuat hien cua ky tu "+ kyTu +" la:"  +solan);
}    
}
