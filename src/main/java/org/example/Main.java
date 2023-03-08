package org.example;

import org.example.Model.TelephoneDirectory;
import org.example.ui.Console;

public class Main {

    /*Создать телефонный справочник с возможностью импорта и экспорта данных в нескольких форматах (txt, csv, xml, json).
        под форматами понимаем структуру файлов, например: в файле на одной строке хранится одна часть записи,
        пустая строка - разделитель*/
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new TelephoneDirectory(), new Console());
        presenter.start();
    }
}