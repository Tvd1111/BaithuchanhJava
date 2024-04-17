package slide79;

import util.configs;

public class main {
    
    public static void main(String[] args) throws Exception {
        //sep full time
        NhanvienFullTime sep = new NhanvienFullTime("Tran Van Sep");
        sep.setLoaiChucVu(configs.NHAN_VIEN_SEP);
        // Nhan Vien full time

        NhanvienFullTime linh1 = new NhanvienFullTime("Nguyen Van A");
        linh1.setLoaiChucVu(configs.NHAN_VIEN_LINH);
        NhanvienFullTime linh2 = new NhanvienFullTime("Nguyen Van B", 2);
        linh2.setLoaiChucVu(configs.NHAN_VIEN_LINH);
        // Nhan Vien parttime

        NhanvienPartTime Tv = new NhanvienPartTime("Nguyen Van C", 150);
         
        // Tinh Luong Nhan Vien
        sep.TinhLuong();
        linh1.TinhLuong();
        linh2.TinhLuong();
        Tv.TinhLuong();
        
        //in thong Tin

        sep.xuatthongtin();
        linh1.xuatthongtin();
        linh2.xuatthongtin();
        Tv.xuatthongtin();
}      
}