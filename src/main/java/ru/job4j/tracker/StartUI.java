package ru.job4j.tracker;

import ru.job4j.tracker.Item;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        System.out.println(item.getCreated());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTime = "dd-MM-yyyy HH:mm:ss";
     //   String currentDateTimeFormat = currentDateTime.format(formatter);
//        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
    }
}


