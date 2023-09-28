package Task3;

import java.io.IOException;

/**
 * Задание 3.2
 * Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */
public class NonExistedFileException extends IOException {
    public NonExistedFileException() {
        super("Файл не существует");
    }

    public NonExistedFileException(String message) {
        super(message);
    }
}
