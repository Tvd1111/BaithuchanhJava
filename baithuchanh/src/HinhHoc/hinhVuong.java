package HinhHoc;

public class hinhVuong extends hinhChuNhat{
    public float canh;
    public hinhVuong(){}
    public void nhapCanh(){
        super.nhapThongTin("nhap canh: ");
        canh = super.data;
    }
    public void tinhDienTich(){
        super.dienTich = canh * canh;
    }
}
