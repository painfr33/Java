package pr1;

public class Ball {
    private int size;
    private String colour;

    public int getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }
    public Ball(){
        size = 5;
        colour = "Orange";
    }
    public Ball(int size, String colour){
        this.colour = colour;
        this.size = size;
    }
    public void setSize(int size){
        this.size = size;
    }

    @Override
    public String toString() {
        return "Ball[size = " + size + ", colour = " + colour + "]";
    }
}


