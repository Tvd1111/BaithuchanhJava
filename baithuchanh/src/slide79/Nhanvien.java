package slide79;

public class Nhanvien {
    protected String Ten;
    protected long Luong;

public Nhanvien(){}
public Nhanvien(String Ten){
    this.Ten =Ten;
}
protected String loaiNhanVien () {
    return "";
}
public void xuatthongtin(){
    System.out.println("Nhan vien: " + Ten);
    System.out.println("Luong : " + Luong + "VND" );
}
}