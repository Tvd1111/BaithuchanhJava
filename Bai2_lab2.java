import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        double a;
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap so a ");
        a=sc.nextDouble();
        if(a%2==0){
            System.out.println("so chan");
        }else System.out.println("so le");
    }
}