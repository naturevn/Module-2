import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng sinh viên");
            size = sc.nextInt();
            if (size > 20) {
                System.out.print("Không được nhập quá 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập điểm của các sinh viên" + (i + 1) + " :");
            array[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("Danh sách điểm");
        for (int j = 0; j < array.length; j++) {
            System.out.println("điểm " + array[j]);
            if (array[j] >= 5 && array[j] <= 10) {
                count++;
            }

        }System.out.print("Tổng số sinh viên thi đỗ " + count);
     }
}
