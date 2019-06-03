import java.util.Scanner;

public class Songuyento {
    public static void main(String[] args) {
        System.out.print("Nhập số kiểm tra");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 2)
            System.out.print(num + " không phải là số nguyên tố");
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.print(num + " Là số nguyên tố");
            } else {
                System.out.print(num + " không phải là số nguyên tố");
            }
        }
    }
}
