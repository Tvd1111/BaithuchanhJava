package slide79;

import util.configs;

public class NhanvienFullTime   extends Nhanvien{
    private int ngayLamThem;
    private int loaiChucVu;
public NhanvienFullTime(String Ten){
    this.Ten=Ten;
}
public NhanvienFullTime(String Ten , int ngayLamThem){
    this.Ten=Ten;
    this.ngayLamThem=ngayLamThem;
}
public void setLoaiChucVu(int loaiChucVu){
    this.loaiChucVu=loaiChucVu;
}
@Override
public String loaiNhanVien () {
    return "Nhan Vien Chinh Thuc";
}
public void TinhLuong(){
    if (loaiChucVu==1){
        Luong=configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + configs.LUONG_LAM_THEM_MOI_NGAY*ngayLamThem;
    }
    else if (loaiChucVu==2){
        Luong=configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + configs.LUONG_LAM_THEM_MOI_NGAY*ngayLamThem;

    }
}
}