import java.util.Scanner;

public class InsertArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("The application finds the largest value in the array.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị cần thay đổi");
        int input = sc.nextInt();
        System.out.print("Nhập vị trị cần thay đổi");
        int index = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (index <= 1 || index >= array.length - 1) {
                System.out.print("Vị trí không thể thay đổi");
            } else {
                array[index] = input;
                System.out.print(array[i] + "\t");
            }
        }
    }
}

