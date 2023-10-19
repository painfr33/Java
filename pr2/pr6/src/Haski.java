public class Haski extends Dog{
    public Haski(int age, String name){
        super(name, age);
    }
    @Override
    public void wave() {
        System.out.println("Хаски по кличке: " + getName() + " не машет хвостом");
    }

    @Override
    public String toString() {
        return getName() + " " + getAge();
    }
}
