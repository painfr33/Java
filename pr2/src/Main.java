public class Main {
    public static void main(String[] args) {
        // Создаем точку и окружность
        Point center = new Point(2.0, 3.0);
        Circle circle = new Circle(center, 4.0);

        // Создаем объект Tester
        Tester tester = new Tester(5); // Максимальный размер массива 5

        // Добавляем окружность в массив
        tester.addCircle(circle);

        // Выводим информацию о всех окружностях
        tester.displayCircles();
    }
}