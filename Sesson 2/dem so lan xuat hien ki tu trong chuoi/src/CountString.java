import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        String[] array = new String[1];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào mảng "+ (i+1));
            array[i] = sc.nextLine();
        }
        System.out.print("Mảng đã nhập vào" +array);
    }
}
