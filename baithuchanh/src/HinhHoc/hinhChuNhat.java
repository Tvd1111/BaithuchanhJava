package HinhHoc;

public class hinhChuNhat extends hinhHoc{
    public float dai;
    public float rong;
    public hinhChuNhat(){};
    public void nhapChieuDai(){
        super.nhapThongTin("nhap chieu dai: ");
        dai = super.data;
    }
    public void nhapChieuRong(){
        super.nhapThongTin("nhap chieu rong: ");
        rong = super.data;
    }
    public void tinhChuVi(){
        super.chuVi = (dai + rong) *2;
    }
    public void tinhDienTich(){
        super.dienTich = dai * rong;
    }
}
