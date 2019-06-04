import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập");
            size = sc.nextInt();
            if (size > 20)
                System.out.print("Giá trị không nhập quá 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập giá trị cho mảng " + (i + 1) + " :");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Hiển thị các phần tử trong mảng");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.print("Giá trị lớn nhất trong mảng là " + max + "vị trí số " + index);
    }
}
