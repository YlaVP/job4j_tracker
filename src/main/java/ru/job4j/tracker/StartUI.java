package ru.job4j.tracker;


import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTime = "dd-MM-yyyy HH:mm:ss";
        String currentDateTimeFormat = currentDateTime.format(String.valueOf(formatter));

        Item item = new Item();
        System.out.println(item.getCreated(currentDateTimeFormat));


    }


}


