public class RealEstate implements Priceable {
    private String address;
    private double price;

    public RealEstate(String address, double price) {
        this.address = address;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
