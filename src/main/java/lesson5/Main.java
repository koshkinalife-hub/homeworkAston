package lesson5;

public class Main {
    public static void main(String[] args) {
        // верный массив 4х4
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        // неверный массив из-за размера
        String[][] wrongSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"}
        };
        // ошибка в данных
        String[][] wrongDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", ",buklya", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = sumArray(correctArray);
            System.out.println("Сумма элементов массива correctArray:" + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка - " + e.getMessage());
        }
        try {
            int sum = sumArray(wrongSizeArray);
            System.out.println("Сумма элементов wrongSizeArray : " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка - " + e.getMessage());
        }

        try {
            int sum = sumArray(wrongDataArray);
            System.out.println("Сумма элементов wrongDataArray : " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка - " + e.getMessage());
        }
        // Отлов ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    // Метод для суммирования элементов массива
    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Неверное количество строк: " + array.length);
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Неверное количество столбцов в строке " + i + ": " + array[i].length);
            }

            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
        return sum;
    }

    // Вложенные классы исключений
    private static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    private static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }
}
