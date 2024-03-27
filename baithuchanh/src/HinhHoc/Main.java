package HinhHoc;
public class Main {
    public static void main(String[] args) {
        hinhTron hinhTron = new hinhTron();
        hinhTron.nhapBanKinh();
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        hinhTron.inChuVi();
        hinhTron.inDienTich();
        hinhtru hinhtru = new hinhtru();
        hinhtru.nhapChieuCao();
        hinhtru.tinhTheTich();
        hinhtru.inTheTich();
        hinhChuNhat hinhchunhat = new hinhChuNhat();
        hinhchunhat.nhapChieuDai();
        hinhchunhat.nhapChieuRong();
        hinhchunhat.tinhChuVi();
        hinhchunhat.tinhDienTich();
        hinhchunhat.inChuVi();
        hinhchunhat.inDienTich();
        hinhVuong hinhVuong = new hinhVuong();
        hinhVuong.nhapCanh();
        hinhVuong.tinhDienTich();
        hinhVuong.inDienTich();
    }
}