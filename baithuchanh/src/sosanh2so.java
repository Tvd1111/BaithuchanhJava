import java.util.Scanner;

public class sosanh2so {
 public static void main(String[] args) {
    int a, b ;
    Scanner sc =new Scanner(System.in);
System.out.println("nhap so nguyen duong a:");
a=sc.nextInt();
System.out.println("nhap so nguyen b:");
b=sc.nextInt();
if(a>b){
    System.out.println("so be hon la: "+ a);
}
else if ( b>a){
    System.out.println("so be hon la: "+ a);
}
else{
    System.out.println("hai so bang nhau va bang: "+a );
}
}
}
