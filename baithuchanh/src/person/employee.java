package person;
public class employee extends Person{
        public String Tencv;
        public String manv;
        public String PhongBan;
        public String ChucVu;
        public float Luong;
        public void xuatTen(){
            System.out.println("ten nhan vien: "+ Tencv);
        }
        public void nhapThongTinnv(){
             super.nhapThongTin("nhap ten nhan vien: ","string");
             Tencv = super.dataString;
             super.nhapThongTin("nhap ma nv : ","string");
             manv = super.dataString;
             super.nhapThongTin("nhap phong ban : ","string");
             PhongBan = super.dataString;
             super.nhapThongTin("nhap Chuc Vu : ","string");
             ChucVu = super.dataString;
        }
         public void nhapLuong(){
             super.nhapThongTin("nhap luong : ","realNumber");
             Luong = super.dataRealNumber;
        }
         public void inLuongThang(){
             System.out.println("Luong thang : "+Luong);
        }
}
