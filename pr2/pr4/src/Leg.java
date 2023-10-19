public class Leg {
    private String LegProportion;

    public Leg(String LegProportion){
        this.LegProportion = LegProportion;
    }

    public String getLegProportion(){
        return LegProportion;
    }

    public void setLegProportion(String legProportion) {
        this.LegProportion = legProportion;
    }

    public void stay(){
        System.out.println("Стоит на месте");
    }
}
