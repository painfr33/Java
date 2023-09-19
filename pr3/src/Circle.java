public abstract class Circle extends Shape {
    double radius;

    public Circle(int size, double radius) {
        super(size);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
