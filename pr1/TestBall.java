public class TestBall {
    public static void main(String[] args){
        Ball ball = new Ball(5, "orange");
        System.out.println("Ball Info:");
        System.out.println("Size: " + ball.getSize());
        System.out.println("Colour: " + ball.getColour());
        ball.setSize(10);
        System.out.println("New Size: " + ball.getSize());
        System.out.println(ball.toString());
    }
}
