package HinhHoc;

public class hinhtru extends hinhTron {
    public float chieuCao;
    public  hinhtru(){}
    public void nhapChieuCao(){
        super.nhapBanKinh();
        super.nhapThongTin("nhap chieu cao: ");
        chieuCao = super.data;
    }
    public void tinhTheTich(){
        super.theTich = super.pi * super.banKinh * super.banKinh * chieuCao;
    }
}
