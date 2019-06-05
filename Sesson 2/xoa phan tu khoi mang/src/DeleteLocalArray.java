import java.util.Scanner;

public class DeleteLocalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length-5; i++) {
            System.out.print("Input Array " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
        System.out.print("Nhập giá trị index");
        int index = sc.nextInt();
        int local = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {
                local = i;
            }
        }
        for (int i = local; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        for (int i = 0; i < array.length - 5; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
