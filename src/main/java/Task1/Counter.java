package Task1;

import java.io.IOException;

/**
 * Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
 * внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
 * можно было работать в блоке try-with-resources. Подумайте, что должно происходить
 * при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
 * При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
 */

public class Counter implements AutoCloseable{
    private int counts = 0;
    boolean isClosed = false;

    public int getCounts() {
        return counts;
    }

    public void add() throws IOException {
        if (isClosed){
            throw  new IOException("Ресур недоступен");
        }
        counts++;
    }

    @Override
    public void close() throws Exception {
        isClosed = true;
//        System.out.println("Ресурс закрыт");
    }
}
