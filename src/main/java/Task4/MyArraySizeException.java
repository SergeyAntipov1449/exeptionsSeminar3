package Task4;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Размер матрицы не соответствует размеру 3х3");
    }
}
