
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sinhvien {
    private String maSV;
    private String hoTen;
    private String lop;

    public sinhvien(String maSV, String hoTen, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, sinhvien> danhSachSinhVien = new HashMap<>();

        System.out.print("Nhap danh sach n sinh vien : ");
        int n = sc.nextInt();
        sc.nextLine();

        // Nhập thông tin sinh viên
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho sinh vien thu " + (i + 1));
            System.out.print("Masv: ");
            String maSV = sc.nextLine();
            System.out.print("Ho Va Ten: ");
            String hoTen = sc.nextLine();
            System.out.print("Lop: ");
            String lop = sc.nextLine();

            sinhvien sv = new sinhvien(maSV, hoTen, lop);
            danhSachSinhVien.put(maSV, sv);
        }

        // Hiển thị danh sách sinh viên
        System.out.println("\nDanh sach sinh vien:");
        for (Map.Entry<String, sinhvien> entry : danhSachSinhVien.entrySet()) {
            System.out.println("Ma SV: " + entry.getKey() + ", Ho Ten: " + entry.getValue().getHoTen() + ", Lop: " + entry.getValue().getLop());
        }
        System.out.print("\nNhap ten lop: ");
        String lopCanHienThi = sc.nextLine();

        // Hiển thị sinh viên thuộc lớp đã nhập
        System.out.println("\nSinh vien thuoc lop " + lopCanHienThi + ":");
        for (Map.Entry<String, sinhvien> entry : danhSachSinhVien.entrySet()) {
            if (entry.getValue().getLop().equalsIgnoreCase(lopCanHienThi)) {
                System.out.println("Ma SV: " + entry.getKey() + ", Ho Ten: " + entry.getValue().getHoTen() + ", Lop: " + entry.getValue().getLop());
            }
    }

     // Nhập mã sinh viên cần hiển thị thông tin
     System.out.print("\nNhap ma sinh vien: ");
     String maSVCanTim = sc.nextLine();

     // Hiển thị thông tin sinh viên tương ứng với mã sinh viên đã nhập
     SinhVien svCanTim = danhSachSinhVien.get(maSVCanTim);
     if (svCanTim != null) {
         System.out.println("\nThong tin sinh vien ma " + maSVCanTim + ":");
         System.out.println("Họ tên: " + svCanTim.getHoTen());
         System.out.println("Lớp: " + svCanTim.getLop());
     } else {
         System.out.println("Khong tim thay sinh vien co ma " + maSVCanTim);
     }

    }
}
    