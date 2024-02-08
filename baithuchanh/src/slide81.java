import java.util.Scanner;

public class sliide81 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so cot cua ma tran : ");
        n = sc.nextInt();
        System.out.println("nhap vao so hang cua ma tran : ");
        m = sc.nextInt();
        int A[][] = new int [m][n];
        System.out.println("nhap cac phan tu cho ma tran : ");
        for(int i = 0; i < m; i++ ) {
            for (int j = 0 ; j<n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int max = A[0][0];
        for (int i = 0; i<m ;i++ ) {
            for(int j =0; j<n ;j++ ) {
                if (max < A[i][j]) {
                    max = A[i][j] ;
                }
            }
        }
        System.out.println("phan tu lon nha trong ma tran = "+ max);
    }
}
