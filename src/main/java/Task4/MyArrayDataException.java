package Task4;

import java.util.List;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int i, int j) {
        super(String.format("В ячейке [%s] [%s] некорректные данные", i, j));
    }

    public MyArrayDataException(List<Point2d> points) {
        super(String.format("В ячейках %s некорректные данные", points));
    }
}
