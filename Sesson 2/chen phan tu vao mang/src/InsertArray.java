import java.util.Scanner;

public class InsertArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 0};
        System.out.println("The application finds the largest value in the array.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vị trị cần thay đổi");
        int index = sc.nextInt();
        if (index <= 1 || index >= array.length - 1) {
            System.out.print("Vị trí không thể thay đổi");
        } else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            System.out.print("Nhập giá trị cần thay đổi");
            int input = sc.nextInt();
            array[index] = input;
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }

        }

    }
}

