package Lesson7;

public class NumberComparator {
    /**
     * Возвращает:
     *   -1 если a < b,
     *    0 если a == b,
     *    1 если a > b
     */
    public static int compare(int a, int b) {
        return Integer.compare(a, b);
    }

    public static boolean isGreater(int a, int b) {
        return a > b;
    }

    public static boolean isEqual(int a, int b) {
        return a == b;
    }
}
