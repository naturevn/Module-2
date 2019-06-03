import java.util.Scanner;

public class toantu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Nhập width");
        width = scanner.nextFloat();
        System.out.println("Nhập Height");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area = " +area);
    }
}
