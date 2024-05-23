import java.util.Scanner;

public class student {
    public String FullName;
    public int Age;
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap HO VA TEN  : ");
        FullName = sc.nextLine();
        System.out.print("nhap tuoi : ");
        Age = sc.nextInt();
    }
    public void inThongTin(){
        System.out.println("Ho Va Ten:" + FullName);
        System.out.println("Tuoi:" + Age);
    }
    public static void main(String[] args) {
        student st=new student();
        st.nhapThongTin();
        st.inThongTin();
    }

}