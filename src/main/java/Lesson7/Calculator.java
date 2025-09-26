package Lesson7;
 /**
     * Простейший калькулятор для двух целых чисел.
     * Аргументы — int, деление возвращает double.
     */
    public class Calculator {

        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        /**
         * Деление a / b. Возвращаем double, чтобы не терять дробную часть.
         * @throws ArithmeticException при делении на ноль
         */
        public static double divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Деление на ноль");
            }
            return (double) a / (double) b;
        }
    }
