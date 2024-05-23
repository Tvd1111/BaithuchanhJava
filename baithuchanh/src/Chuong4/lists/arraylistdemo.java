import java.util.ArrayList;
import java.util.Scanner;

public class arraylistdemo {
     public static void main(String[] args) {
        ArrayList<student> Arraylist = new ArrayList<student>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong sinh vien can bo sung : ");
        n = sc.nextInt();
        for(int i = 0; i < n ; i++) {
            student st =new student();
            st.nhapThongTin();
            Arraylist.add(st);
        }
       
            Arraylist.remove(0);
             System.out.println("------Sinh vien vua duoc them vao-------");

            for(int i = 0; i < Arraylist.size();i++){
            
                Arraylist.get(i).inThongTin();
            }
    }

}
