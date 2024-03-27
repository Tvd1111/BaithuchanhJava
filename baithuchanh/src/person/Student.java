package person;

import java.util.Scanner;

public class Student extends Person{
    public String masv;
    public String lop;
    public String khoa;
    public void nhapttsv(){
        super.nhapThongTin("nhap ma sv : ","string");
        masv = super.dataString;
        super.nhapThongTin("nhap lop : ","string");
        lop = super.dataString;
        super.nhapThongTin("nhap khoa : ","string");
        khoa = super.dataString;
    }
    public void inttsv(){
        System.out.println("ma sinh vien cua ban la:"+masv);
        System.out.println("lop cua ban la:"+lop);
        System.out.println("khoa cua ban la:"+khoa);
    }
}
