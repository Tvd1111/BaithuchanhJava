import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        int so=0;
        int chuhoa=0;
        int chuthuong=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chuoi bat ki : ");
        chuoi = sc.nextLine();
        for (int i = 0;i<chuoi.length();i++ ) {
            kyTu = chuoi.charAt(i);
        if (Character.isUpperCase(kyTu)){
            chuhoa++;
        } else if (Character.isLowerCase(kyTu)){
            chuthuong++;
        } else if (Character.isDigit(kyTu)){
            so++;
        }
        }
        System.out.println("So chu viet hoa la :" +chuhoa);
        System.out.println("So chu viet thuong la :" +chuthuong);
        System.out.println("So chu so la :" +so);
    }
 }