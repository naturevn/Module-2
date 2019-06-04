public class MinArray {
    public static void main(String[] args) {
        int[] array = {-1, 0, 2, 4, -2};
        System.out.print("Tìm giá trị nhỏ nhất trong mảng");
        int min = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i+1;
                System.out.print("Giá trị nhỏ nhất " + min + " vị trí " + index);
            }
        }
    }
}
