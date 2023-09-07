import java.util.Scanner;
public class Zadacha4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент: " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        int i = 0;

        do {
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            i++;
        }while (i < n);
        i = 0;
        int sumWhile = 0;
        while (i < n) {
            sumWhile += numbers[i];
            i++;
        }



        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Сумма элементов массива: " + sumWhile);
    }
}
