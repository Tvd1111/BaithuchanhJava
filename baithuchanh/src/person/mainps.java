package person;
public class mainps {
    public static void main(String[] args) {
        Person ps=new Person();
        ps.nhaptt();
        ps.tinhtuoi();
        ps.inthongtin();
        employee epl=new employee();
        epl.nhapThongTinnv();
        epl.xuatTen();
        epl.nhapLuong();
        epl.inLuongThang();
        fulltime ft=new fulltime();
        ft.nhapluongft();
        ft.tinhluongft();
        ft.inluongft();
        parttime pte=new parttime();
        pte.nhapSoNgayLamViec();
        pte.TinhLuong();
        pte.inluongpt();
        Student st=new Student();
        st.nhapttsv();
        st.inttsv();
    }
}
