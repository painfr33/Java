public abstract class Triangle extends Shape {
    double base, height;
    public Triangle(int size, double base, double height) {
        super(size);
        this.base = base;
        this.height = height;
    }
    @Override
    public double CalculateShapeArea(){
        return 0.5 * base * height;
    }
}
