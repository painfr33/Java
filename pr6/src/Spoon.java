public class Spoon extends Dish{
    public Spoon(int size, String material, String color){
        super(size, color, material);
    }

    @Override
    public void usage() {
        System.out.println("Ложка");
    }
}
