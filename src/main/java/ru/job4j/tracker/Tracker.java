package ru.job4j.tracker;

public class Tracker {
    private final Item[] item = new Item[100];
    private int id = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(id++);
        this.item[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = this.item[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}