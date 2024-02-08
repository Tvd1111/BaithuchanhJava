import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        int n,trungbinhcong=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen duong n : ");
        n = sc.nextInt();
        for (int i = 0;i<=n;i++ ) {
            trungbinhcong +=i ;
        }
            trungbinhcong/=n;
            System.out.println("trung binh cong = " +trungbinhcong );
        }
    }
