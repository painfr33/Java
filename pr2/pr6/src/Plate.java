public class Plate extends Dish{
    public Plate(int size, String color, String material){
        super(size, color, material);
    }

    @Override
    public void usage() {
        System.out.println("Тарелка");
    }
}
