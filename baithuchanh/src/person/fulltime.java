package person;
public class fulltime extends employee{
    public float luongcung;
    public float thuongthem;
    public float baohiem;
    public void nhapluongft(){
        super.Tencv="fulltime";
        super.nhapThongTin("nhap luong cung: ","realNumber");
        luongcung = super.dataRealNumber;
        super.nhapThongTin("nhap thuong them: ","realNumber");
        thuongthem = super.dataRealNumber;
        super.nhapThongTin("nhap bao hiem: ","realNumber");
        baohiem = super.dataRealNumber;
    }
    public void tinhluongft(){
        super.Luong=luongcung+thuongthem-baohiem;
    }
    public void inluongft(){
        System.out.println("day la viec lam:"+super.Tencv);
        System.out.println("luong cong viec fulltime la:"+super.Luong);
    }
}
