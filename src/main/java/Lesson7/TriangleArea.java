package Lesson7;

public class TriangleArea {
    /**
     * Возвращает площадь треугольника со сторонами a, b, c.
     * @throws IllegalArgumentException если стороны <= 0 или не выполняется неравенство треугольника
     */
    public static double areaBySides(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Стороны должны быть положительными");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Сумма двух сторон должна быть больше третьей");
        }
        double p = (a + b + c) / 2.0; // полупериметр
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
