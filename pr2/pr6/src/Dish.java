
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

    // Dish.Dish class
    public static class Dish {
        private double cost;
        private String name;
        private String description;

        // Constructors
        public Dish(double cost, String name, String description) {
            this.cost = cost;
            this.name = name;
            this.description = description;
        }

        // Getters and Setters
        public double getCost() {
            return cost;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}