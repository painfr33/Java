public class TestPriceable {
    public static void main(String[] args) {
        Priceable product = new Product("Компьютер", 1000.0);
        Priceable realEstate = new RealEstate("123 Main St", 500000.0);

        System.out.println("Цена товара: $" + product.getPrice());
        System.out.println("Цена недвижимости: $" + realEstate.getPrice());
    }
}
