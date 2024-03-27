package person;
import java.util.Scanner;

public class Person {
    public int dataNumber;
    public float dataRealNumber;
    public String dataString;
    public String hoten;
    public String gioitinh;
    public String cccd;
    public int namsinh;
    public int tuoi;
    public void nhapThongTin(String content,String th){
        Scanner sc = new Scanner(System.in);
            switch (th){
                case "number" : {
                    System.out.println(content);
                    dataNumber = sc.nextInt();
                    break;
                }
                case "string" : {
                    System.out.println(content);
                    dataString = sc.nextLine();
                    break;
                }
                case "realNumber" : {
                    System.out.println(content);
                    dataRealNumber= sc.nextFloat();
                    break;
                }
            }
    }
    public void nhaptt(){
       nhapThongTin("nhap ho va ten: ","string");
       this.hoten = dataString;
       nhapThongTin("nhap gioi tinh: ","string");
       this.gioitinh = dataString;
       nhapThongTin("nhap cccd: ","string");
       this.cccd = dataString;
       nhapThongTin("nhap nam sinh: ","number");
       this.namsinh = dataNumber;
    }
    public int tinhtuoi(){
        return tuoi=2024-namsinh;
    }
    public void inthongtin(){
        System.out.println("ho va ten:"+hoten);
        System.out.println("gioi tinh:"+gioitinh);
        System.out.println("ma cccd:"+cccd);
        System.out.println("nam sinh:"+namsinh);
        System.out.println("tuoi:"+tinhtuoi());
    }
}
