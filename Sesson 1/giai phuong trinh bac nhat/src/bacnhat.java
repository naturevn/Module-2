import java.util.Scanner;

public class bacnhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        System.out.println("Nhap a");
        a = scanner.nextDouble();
        System.out.println("Nhap b");
        b = scanner.nextDouble();
        if (a != 0) {
            double answer = -b / a;
            System.out.print("Giá trị x = " + answer);
        } else {
            if (b == 0) {
                System.out.print("Vô số nghiệm");
            } else {
                System.out.print("Vô nghiệm");
            }
        }
    }
}
