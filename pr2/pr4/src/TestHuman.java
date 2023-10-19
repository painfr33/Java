public class TestHuman {
    public static void main(String[] args){
        Head head = new Head("White", "Smile");
        Leg leftleg = new Leg("thin");
        Leg righttleg = new Leg("thin");
        Hand righthand = new Hand(true);
        Hand lefthand = new Hand(true);
        Human human = new Human(righthand, lefthand, head, leftleg, righttleg);
        human.Actions();
    }
}
