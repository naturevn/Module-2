import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập để kiểm tra năm nhuận");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.print("Năm " + year + " Năm nhuận");
                } else {
                    System.out.print("Không phải năm nhuận");
                }
            }else {
                System.out.print("Năm nhuận");
            }
        }else {
            System.out.print("Không phải là năm nhuận");
        }
    }
}
