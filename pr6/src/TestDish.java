public class TestDish {
    public static void main(String[] args){
        Glass glass = new Glass("blue", 1, "wood", true);
        Plate plate = new Plate(3, "white", "glass");
        Spoon spoon = new Spoon(1, "steel", "grey");
        glass.usage();
        System.out.println("Материал стакана: " + glass.getMaterial());
        System.out.println("Цвет стакана: " + glass.getColor());
        System.out.println("Размер стакана: " + glass.getSize());
        System.out.println("Ручка: " + (glass.isHandle() ? "Да" : "Нет"));
        plate.usage();
        System.out.println("Материал тарелки: " + plate.getMaterial());
        System.out.println("Цвет тарелки: " + plate.getColor());
        System.out.println("Размер тарелки: " + plate.getSize());
        spoon.usage();
        System.out.println("Материал ложки: " + spoon.getMaterial());
        System.out.println("Цвет ложки: " + spoon.getColor());
        System.out.println("Размер ложки: " + spoon.getSize());
    }
}
