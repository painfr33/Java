public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int ySpeed;
    protected int xSpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint: Point (" + x + ", " + y + ")";
    }
    @Override
    public void moveUp(){
        y++;
    }
    @Override
    public void moveDown(){
        y--;
    }
    @Override
    public void moveLeft(){
        x--;
    }
    @Override
    public void moveRight(){
        x++;
    }
}