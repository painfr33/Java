public class Zadacha3 {
    public static void main(String[] args){
        int[] numbers = {11, 22, 33, 44, 55};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        int average = (int) sum / numbers.length  ;
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + average);
    }
}


