public class TestDog {
    public static void main(String[] args){
        Haski haski = new Haski(12, "Pes");
        Shibainu shibainu = new Shibainu(1, "L");
        System.out.println("Dog Info: ");
        System.out.println(shibainu);
        shibainu.wave();
        System.out.println("Dog Info: " + haski.toString());
        haski.wave();
    }
}
