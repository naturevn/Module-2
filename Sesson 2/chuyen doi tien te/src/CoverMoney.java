import java.util.Scanner;

public class CoverMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double USD, VND;
        System.out.println("Input Money Cover(USD)->VND:");
        USD = sc.nextDouble();
        VND = USD * 23000;
        System.out.printf("Cover Money : USD -> VND :" + VND);
    }
}