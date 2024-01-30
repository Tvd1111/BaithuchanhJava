public class Bai5 {
    import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int sum = 0;
        
        System.out.println("Nhập các số nguyên. Nhập số âm để kết thúc:");
        
        while (true) {
            int num = scanner.nextInt();
            
            if (num < 0) {
                break;
            }
            
            numbers.add(num);
            sum += num;
            
            if (sum > 100) {
                break;
            }
        }
        
        System.out.println("Các số đã nhập:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        
        System.out.println("\nTổng các số: " + sum);
    }
}
}
