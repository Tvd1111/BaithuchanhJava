import java.util.Scanner;

public class Student {
    public String ten;
    public String lop;
    public float msv;
    public float toan;
    public float van;
    public float anh;
    public float diemtongket;
    public void nhapthongtin(){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap ten:");
        ten=sc.nextLine();
        System.out.print("nhap lop:");
        lop=sc.nextLine();
        System.out.print("nhap msv:");
        msv=sc.nextFloat();
        System.out.print("nhap diem toan:");
        toan=sc.nextFloat();
        System.out.print("nhap diem van:");
        van=sc.nextFloat();
        System.out.print("nhap diem anh:");
        anh=sc.nextFloat();
        diemtongket=(toan+van+anh)/3;
    }
    public void inthongtin(){
        System.out.print("diem tong ket la:"+diemtongket);
    }
    public static void main(String[] srgs){
        Student st=new Student();
        st.nhapthongtin();
        st.inthongtin();
    }
}
