
import java.util.Scanner;

public class SoNguyento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số nguyên tố cần in ra");
        int num = input.nextInt();

        int count = 0;
        int n = 2;
        System.out.println(num + " số nguyên tố đầu tiên là: ");
        while (count < num) {
            if (check_Primes(n)) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }

    public static boolean check_Primes(int num) {
        boolean flag = true;
        if (num < 2) {
            flag = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}

