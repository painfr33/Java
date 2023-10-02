
public abstract class Dish {
    private String color;
    private String material;

    private int size;


    public Dish(int size, String color, String material){
        this.size = size;
        this.color = color;
        this.material = material;
    }
    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract void usage();

}