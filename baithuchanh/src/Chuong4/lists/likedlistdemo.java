import java.util.LinkedList;
import java.util.Scanner;

public class likedlistdemo {
     public static void main(String[] args) {
        LinkedList<student> linkedlistPerson = new LinkedList<student>();

         int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong sinh vien can chinh sua :");
        n = sc.nextInt();
        //nhap thong tin
        for(int i = 0; i < n ; i++) {
            student st =new student();
            st.nhapThongTin();
            linkedlistPerson.add(st);
        }
        //xuat thong tin
        for(int i = 0; i < linkedlistPerson.size();i++){
            System.out.println("<------thong tin sinh vien ----->");
            linkedlistPerson.get(i).inThongTin();
        }

        //xoa thong tin
        linkedlistPerson.remove(0);

        for(int i = 0; i < linkedlistPerson.size();i++){
            System.out.println("<------sinh vien vua duoc loai bo ----->");
            linkedlistPerson.get(i).inThongTin();
        }
    }
}
