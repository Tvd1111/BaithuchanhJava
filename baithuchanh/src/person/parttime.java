package person;
public class parttime extends employee{
        public float sogio;
        public float songay;
        public float cong1gio;
        public void nhapSoNgayLamViec(){
            super.Tencv="parttime";
            super.nhapThongTin("nhap so ngay lam viec trong 1 thang: ","realNumber");
            songay = super.dataRealNumber;
            super.nhapThongTin("nhao so gio lam viec: ","realNumber");
            sogio = super.dataRealNumber;
            super.nhapThongTin("nhap cong mot gio: ","realNumber");
            cong1gio = super.dataRealNumber;
        }
        public void TinhLuong(){
            super.Luong = cong1gio*sogio*songay;
        }
        public void inluongpt(){
            System.out.println("day la viec lam:"+super.Tencv);
            System.out.println("luong cv parttime la:"+super.Luong);
        }
}