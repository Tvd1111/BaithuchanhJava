import java.util.Scanner;

public class hinhtron {
    final float Pi = 3.14f;
    float  r ;
    float ChuVi;
    float DienTich;
    public void nhapBanKinh(){
        System.out.println("nhap Ban Kinh : ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
    }
     public void tinhChuVi(){
        ChuVi = 2*Pi*r;
     }
     public void tinhDienTich(){
        DienTich = Pi*r*r;
     }
     public void inChuVi(){
        System.out.println(" Chu Vi hinh tron :" +ChuVi );
     }
     public void inDienTich(){
        System.out.println(" Dien Tich hinh tron : " +DienTich );
     }
     public static void main(String[] args) throws Exception {
         hinhtron HT = new hinhtron();
          HT.nhapBanKinh();
          HT.tinhChuVi();
          HT.tinhDienTich();
          HT.inChuVi();
          HT.inDienTich();
       }
}