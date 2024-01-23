import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        double a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap so a ");
        a=sc.nextDouble();
        System.out.print("nhap so b ");
        b=sc.nextDouble();
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(a%b);
        System.out.println(a+b);
        if(a>b){
            System.out.println("a lon hon b");
        }else if(a==b){
            System.out.println(a);
        }else if(a<b){
            System.out.println("a nho hon b");
        }
    }
}