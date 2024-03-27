package HinhHoc;

import java.util.Scanner;

public class hinhHoc {
    public  float data = 0;
    public float pi = 3.14F;
    public String ten;
    public float chuVi;
    public float dienTich;
    public float theTich;
    public hinhHoc(){}

    public void xuatTen(){
        System.out.println("ten : "+ ten);
    }
    public void inChuVi(){
        System.out.println("chu vi : " + chuVi);
    }
    public void inDienTich(){
        System.out.println("dien tich: " + dienTich);
    }
    public void inTheTich(){
        System.out.println("the tich : "+ theTich);
    }
    public void nhapThongTin(String args){
        Scanner sc = new Scanner(System.in);
        System.out.println(args);
        data = sc.nextFloat();
    }
}
