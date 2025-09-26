package Lesson7;

public class Factorial {
    /**
     * Вычисляет факториал n: n! = 1*2*...*n
     *
     * @param n неотрицательное целое число
     * @return n!
     * @throws IllegalArgumentException если n < 0
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным: n = " + n);
        }
        long result = 1L;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
