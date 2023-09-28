package Task4;

import java.util.ArrayList;
import java.util.List;

/**
 * Напишите метод, на вход которого подаётся двумерный строковый массив размером 3х3.
 * При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 * <p>
 * 1. Далее метод должен пройтись по всем элементам массива, преобразовать в double и просуммировать.
 * Если в каком-то элементе массива преобразование не удалось
 * (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException
 * с детализацией, в какой именно ячейке лежат неверные данные.
 * <p>
 * 2. В методе main() вызвать полученный метод, обработать возможные исключения
 * MyArraySizeException и MyArrayDataException и вывести результат расчета
 * (сумму элементов, при условии, что подали на вход корректный массив).
 */
public class Task4 {
    static String[][] arr = new String[][]{
            {"b", "1.5", "1.5"},
            {"1", "1.5", "1.5"},
            {"a", "1.5", "1.5"}
    };

    public static void main(String[] args) {
        System.out.println(sum2dV2(arr));
    }

    public static boolean matrixSqrCheck(String[][] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arr.length) {
                flag = false;
            }
        }
        return flag;
    }

    public static double sum2d(String[][] arr) {
        if (!matrixSqrCheck(arr)) throw new MyArraySizeException();
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Double.parseDouble(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

    public static double sum2dV2(String[][] arr) {
        if (!matrixSqrCheck(arr)) throw new MyArraySizeException();
        double sum = 0;
        List<Point2d> indexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Double.parseDouble(arr[i][j]);
                } catch (NumberFormatException e) {
                    indexes.add(new Point2d(i, j));
                }
            }
        }
        if (!indexes.isEmpty()) {
            throw new MyArrayDataException(indexes);
        }
        return sum;
    }
}
