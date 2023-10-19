public class Human {

    private Leg leftLeg;
    private Leg rightLeg;
    private Head head;
    private Hand leftHand;
    private Hand rightHand;
    public Human(Hand rightHand, Hand leftHand, Head head, Leg leftLeg, Leg rightLeg){
        this.rightHand = rightHand;
        this.leftHand = leftHand;
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }

    public void Actions(){
        head.talk("l m");
        rightHand.wave();
        leftLeg.stay();
        rightLeg.stay();
        leftHand.wave();
    }
}
