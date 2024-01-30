import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();

        System.out.print("Nhập năm sinh của bạn: ");
        int birthYear = scanner.nextInt();

        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - birthYear;

        String ageGroup;

        if (age < 16) {
            ageGroup = "vị thành niên";
        } else if (age < 18) {
            ageGroup = "trưởng thành";
        } else {
            ageGroup = "đã già";
        }

        System.out.println("Bạn " + name + " ở tuổi " + ageGroup);
    }
}