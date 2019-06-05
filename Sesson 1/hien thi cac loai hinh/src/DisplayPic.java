import java.util.Scanner;

public class DisplayPic {
    public static void main(String[] args) {
        int choice, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.println("hiển thị các loại hình");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle ");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("Enter choice: ");

        while (true) {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (i = 0; i < 3; i++) {
                        System.out.println("********");
                    }
                    break;
                case 2:
                    for (i = 6; i >= 1; i--) {
                        for (j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (i = 1; i <= 7; i++) {
                        for (j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
