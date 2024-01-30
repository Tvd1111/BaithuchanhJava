public class phuongtrinhbac2 {
    public static void main(String[] args){
        double hesoA,hesoB,hesoC,nghiemX1,nghiemX2,delta;
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap hesoA ");
        hesoA = sc.nextDouble();
        System.out.print("nhap hesoB ");
        hesoB = sc.nextDouble();
        System.out.print("nhap hesoC ");
        hesoC = sc.nextDouble();
        delta=Math.pow(hesoB,2)-(4*hesoA*hesoC);
        System.out.println(delta);
        if(delta<0){
            System.out.println("phuong trinh vo nghiem ");
        }else if(delta==0){
            System.out.println("phuong trinh co nghiem kep ");
            nghiemX1=nghiemX2=-hesoB/(2*hesoA);
            System.out.println(nghiemX1);
        }else if(delta>0){
            System.out.println("phuong trinh co hai nghiem phan biet ");
            nghiemX1=(-hesoB + Math.sqrt(delta))/(2*hesoA);
            nghiemX2=(-hesoB - Math.sqrt(delta))/(2*hesoA);
            System.out.println(nghiemX1);
            System.out.println(nghiemX2);
        }
    }
}
