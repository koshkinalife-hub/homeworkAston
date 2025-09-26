package Lesson7;

public class Main { public static void main(String[] args) {
    // Factorial
    System.out.println("5! = " + Factorial.factorial(5)); // 120

    // Triangle area
    double area = TriangleArea.areaBySides(3, 4, 5);
    System.out.println("Площадь треугольника 3,4,5 = " + area); // 6.0

    // Calculator
    System.out.println("5 + 3 = " + Calculator.add(5, 3));
    System.out.println("5 - 3 = " + Calculator.subtract(5, 3));
    System.out.println("5 * 3 = " + Calculator.multiply(5, 3));
    System.out.println("5 / 2 = " + Calculator.divide(5, 2)); // 2.5

    // Comparator
    System.out.println("compare(2,3) = " + NumberComparator.compare(2, 3)); // -1
    System.out.println("isGreater(7,3) = " + NumberComparator.isGreater(7, 3)); // true
}
}
