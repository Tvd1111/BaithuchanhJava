import java.util.Scanner;
public class slide30{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n , sodu , tong=0;
        System.out.println("nhap so nguyen n bat ky:");
        n=sc.nextInt();
        while(n>0){
            sodu=n%10;
            n=n/10;
            tong+=sodu;
        }
        System.out.println("tong cac chu so la:"+tong);
    }
}