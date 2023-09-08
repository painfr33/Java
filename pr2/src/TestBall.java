public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1, 1);
        System.out.println("Ball Info: ");
        System.out.println(ball);
        ball.move(5,5);
        System.out.println(ball);

    }
}
