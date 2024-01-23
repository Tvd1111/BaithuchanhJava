import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        double hesoA,hesoB,nghiemX;
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap hesoA");
        hesoA = sc.nextDouble();
        System.out.print("nhap hesoB");
        hesoB = sc.nextDouble();
        nghiemX = -hesoB/hesoA;
        System.out.println(nghiemX);
    }
}