public abstract class Shape {
    int size;

    public Shape(int size) {
        this.size = size;
    }
    public abstract double CalculateShapeArea();

    public int getSize() {
        return size;
    }

    public abstract double calculateArea();
}

