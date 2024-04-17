package slide79;
import util.configs;

public class NhanvienPartTime extends Nhanvien{
    private int gioLamViec;
    public NhanvienPartTime(String Ten , int gioLamViec){
    this.Ten = Ten;
    this.gioLamViec=gioLamViec;
}
@Override
    public String loaiNhanVien () {
        return "Nhan Vien Thoi Vu";
}
public void TinhLuong(){
    Luong=configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
}
}