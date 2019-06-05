import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(b,2) - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            double r1 = ((-b) + Math.sqrt(getDiscriminant())) / (2 * a);
            return r1;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            double r2 = ((-b) - Math.sqrt(getDiscriminant())) / (2 * a);
            return r2;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a = ");
        int a = scanner.nextInt();
        System.out.println("Input b = ");
        int b = scanner.nextInt();
        System.out.println("Input c = ");
        int c = scanner.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() < 0){
            System.out.println("the equation no solution");
        } else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("the equation have two solution equal " + quadraticEquation.getRoot1());
        } else if (quadraticEquation.getDiscriminant() >0){
            System.out.println("the equation have two solution distinguish");
            System.out.println("x1= " + quadraticEquation.getRoot1());
            System.out.println("x2= " + quadraticEquation.getRoot2());
        }
    }
}
