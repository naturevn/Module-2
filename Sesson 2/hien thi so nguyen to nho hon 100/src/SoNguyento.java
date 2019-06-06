public class SoNguyento {
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

    public static void main(String[] args) {
        System.out.println("Số nguyên tố nhỏ hơn 100");
        for (int i = 0; i <= 100; i++) {
            if (check_Primes(i)) {
                System.out.println(i);
            }
        }
    }
}
