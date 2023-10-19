import static java.lang.Math.pow;

public class Circle {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calcArea(){
        return Math.PI * pow(radius, 2);
    }
    public double getLength(){
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
}