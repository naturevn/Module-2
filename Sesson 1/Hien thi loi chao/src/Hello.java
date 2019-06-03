import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui lòng nhập tên của bạn");
        String name = scanner.nextLine();
        System.out.print("Chào bạn " + name + " Hôm nay bạn thế nào");
    }

}
