package ExceptionSeminar3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Program1 {
    public static void main(String[] args) throws IOException {

//        Writer w = new FileWriter("d");
//        try(Count count = new Count(1) {
//            @Override
//            public void close() throws Exception {
//
//            }
//        }) {
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

    }
}

abstract class Count implements AutoCloseable {

    private int count;

    public Count(int count) {
        this.count = count;
    }

    public void add() {
        this.count++;
    }



    @Override
    public abstract void close() throws Exception;
}
//    Создайте класс Счетчик, у которого есть метод add(),
//        увеличивающий значение внутренней int
//        переменной на 1. Сделайте так, чтобы с
//        объектом такого типа можно было работать в
//        блоке try-with-resources и после выхода из
//        блока, он не давал больше возможности выполнять
//        метод add(), а при попытке это сделать бросал бы
//        исключение. Подумайте над типом исключения.