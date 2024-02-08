import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        int n,m;
        System.out.print("Nhap so hang: ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        System.out.print("Nhap so cot: ");
        m=sc.nextInt();
        int A[][]=new int[n][m];
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("Phan tu thu ["+i+","+j+"] la: ");
                A[i][j]=sc.nextInt();
                if(A[i][j]>max)
                max=A[i][j];
            }
        }
        System.out.print("Gia tri lon nhat trong ma tran la: "+max);
    }
}