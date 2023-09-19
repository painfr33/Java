public abstract class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(int size, double width, double height) {
        super(size);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}