import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập độ dài mảng");
            size = sc.nextInt();
            if (size > 10) {
                System.out.print("Giá trị không nhập quá 10");
            }
        } while (size > 10);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập giá trị mảng " + (i + 1));
            array[i] = sc.nextInt();
            i++;
        }
        int min = array[0];
        for (i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất :" + min);
    }
}
