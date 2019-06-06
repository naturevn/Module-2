public class Circle {
    public double radius;
    public String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }



    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    // dien tich
    public double getAcreage() {
        return Math.PI * Math.pow(radius,2);
    }


    public String toString() {
        return "lay ban kinh "
                + getRadius()
                + " lay mau "
                + getColor();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(4, "blue");
        System.out.println(circle);
        System.out.print("Diện tích hình tròn :" + circle.getAcreage());
    }
}
