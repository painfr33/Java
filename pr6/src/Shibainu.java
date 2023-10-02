public class Shibainu extends Dog{
    public Shibainu(int age, String name){
        super(name, age);
    }

    @Override
    public void wave() {
        System.out.println("Сиба-Ину по кличке: "+ getName()+  " Машет хвостом");
    }
    @Override
    public String toString() {
        return this.getName() + " " + this.getAge();
    }
}

