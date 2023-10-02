public class TestCircle {
    public static void main(String[] args){
        Circle circle = new Circle(5);
        System.out.println("Circle info:");
        System.out.println(circle);
        System.out.println("Circle Area: " + circle.calcArea());
        System.out.println("Circle Length: " + circle.getLength());
        System.out.println("Changed radius");
        circle.setRadius(7);
        System.out.println(circle);
        System.out.println("Circle Area: " + circle.calcArea());
        System.out.println("Circle Length: " + circle.getLength());
    }
}
