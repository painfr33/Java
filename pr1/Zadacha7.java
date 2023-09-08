public class Zadacha7 {
    public static void main(String[] args) {
        double sum = 0;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
            System.out.printf("H%d = %.2f\n", i, sum);
        }
    }
}