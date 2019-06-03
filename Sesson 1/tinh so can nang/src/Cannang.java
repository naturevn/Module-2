import java.util.Scanner;

public class Cannang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cân năng");
        double weight = sc.nextDouble();
        System.out.print("Nhập chiều cao");
        double height = sc.nextDouble();
        double ibm = weight / Math.pow(height, 2);
        if (ibm < 18)
            System.out.print("Underweight");
        else if (ibm < 25.0)
            System.out.print("Normal");
        else if (ibm < 30.0)
            System.out.print("Overweight");
        else
            System.out.print("Obese");
    }
}
