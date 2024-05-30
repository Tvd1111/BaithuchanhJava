
import java.util.LinkedList;
import java.util.Scanner;
public class TVD785_SAVADATA implements TVD785_ThongTin{
    public static LinkedList<TVD785_DATA> linkedList = new LinkedList<>();
    public static Scanner sc = new Scanner(System.in);
    @Override
    public void HienThi() {
       for(TVD785_DATA tvd785_DATA : linkedList){
        System.out.println("ten: " + tvd785_DATA.ten);
        System.out.println("tuoi: " + tvd785_DATA.tuoi);
        System.out.println("msv: " + tvd785_DATA.msv);
        System.out.println("diemthi : " + tvd785_DATA.diemthi);
       }  
    }
    @Override
    public void nhapThongTin() {
        TVD785_DATA tvd785_DATA = new TVD785_DATA();

       tvd785_DATA.ten = sc.nextLine();
       tvd785_DATA.age = sc.nextInt();
       tvd785_DATA.msv = sc.nextLine();
       tvd785_DATA.diemthi = sc.nextFloat();
       linkedList.add(tvd785_DATA);
    }
    @Override
    public void suaThongTin() {
        System.out.println("nhập mã sinh viên cần chỉnh sửa: ");
        String msv1 = sc.nextLine();
        for( int i =0; i<linkedList.size();i++){
            TVD785_DATA tvd785_DATA = linkedList.get(i);
            if(tvd785_DATA.msv.equals(msv1)){
                tvd785_DATA.msv = msv1;
                linkedList.set(i, tvd785_DATA);
            }
        }
        
    }
    @Override
    public void themThongTin() {
        System.out.println("nhập mã sinh viên : ");
        String msv1 = sc.nextLine();
                System.out.println("nhập diem thi cần thêm: ");
        float diemthi1 = sc.nextFloat();
        for( int i =0; i<linkedList.size();i++){
            TVD785_DATA tvd785_DATA = linkedList.get(i);
            if(tvd785_DATA.msv.equals(msv1)){
                tvd785_DATA.diemthi = diemthi1;
                linkedList.set(i, tvd785_DATA);
            }
        }
    }
    @Override
    public void xoaThongTin() {
        
        System.out.println("nhập mã sinh viên cần xóa : ");
        String msv1 = sc.nextLine();
        for( int i =0; i<linkedList.size();i++){
            TVD785_DATA tvd785_DATA = linkedList.get(i);
            if(tvd785_DATA.msv.equals(msv1)){
                linkedList.remove(tvd785_DATA);
            }
        }
    }
    
}
