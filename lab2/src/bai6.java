import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
    int n, giaithua=1 ;
    Scanner sc = new Scanner(System.in);
    do {
        System.out.println("nhap so nguyen duong n : ");
        n = sc.nextInt();
    }
    while(n<0);
    for (int i= 1; i<=n;i++ )
    giaithua *=i ;
    System.out.println("giai thua cua so do = "+ giaithua );
   }
}