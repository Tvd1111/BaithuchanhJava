package HinhHoc;

public class hinhTron extends hinhHoc{
    public float banKinh;
    public hinhTron(){}
    public void nhapBanKinh(){
        super.nhapThongTin("nhap ban kinh: ");
        banKinh = super.data;
    }
    public void tinhChuVi(){
        super.chuVi = 2*pi*banKinh;
    }
    public void tinhDienTich(){
        super.dienTich = pi * banKinh *banKinh;
    }
}
