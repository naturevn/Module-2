public class ClassFan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public ClassFan() {
    }

    public ClassFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean getOn() {
        return true;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }
    public String toString(){
        return "speed "
                +getSpeed()
                +" on/off "
                +getOn()
                +" radius "
                +getRadius()
                + " color "
                +getColor();
    }

    public static void main(String[] args) {
        ClassFan classFan = new ClassFan();
        System.out.println(classFan);
        classFan = new ClassFan(2,true,3,"Pink");
        System.out.println(classFan);
    }
}
