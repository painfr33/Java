public class Head {
    private String HairColor;
    private String Emotion;

    public Head(String HairColor, String Emotion){
        this.Emotion = Emotion;
        this.HairColor = HairColor;
    }

    public void setHairColor(String HairColor){
        this.HairColor = HairColor;
    }
    public void setEmotion(String Emotion) {
        this.Emotion = Emotion;
    }

    public String getHairColor(){
        return HairColor;
    }
    public String getEmotion(){
        return Emotion;
    }
    public void talk(String message){
        System.out.println("Разговаривает " + message);
    }
}
