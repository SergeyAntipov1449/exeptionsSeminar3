package org.example;

import Task1.Counter;
import Task3.DivideByZeroException;
import Task3.NonExistedFileException;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        Counter counter = new Counter();
//        counter.add();
//        System.out.println(counter.getCounts());
//        try {
//            counter.close();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        counter.add();
//        try (Counter counter = new Counter()) {
//            counter.add();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("zeroDivideCheck(6,2) = " + zeroDivideCheck(6, 2));
//        zeroDivideCheck(5,0);

        fileExistCheck("dasdddddddd");
    }

    public static double zeroDivideCheck(int a, int b) {
        if (b == 0) {
            throw new DivideByZeroException();
        }
        return a / b;
    }

    public static void fileExistCheck(String path) throws NonExistedFileException {
        File file = new File(path);
        if (!file.exists()) {
            throw new NonExistedFileException();
        }
        System.out.println("Чтение файла");
    }
}