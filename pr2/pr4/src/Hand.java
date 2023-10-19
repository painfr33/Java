public class Hand {
    private boolean fingers;

    public Hand(boolean fingers){
        this.fingers = fingers;
    }
    public boolean isFingers(){
        return fingers;
    }
    public void setFingers(boolean isFingers){
        this.fingers = fingers;
    }
    public void wave(){
        System.out.println("Машет рукой");
    }
}
