package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    //private final Item[] items = new Item[100];
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            //if (items[index].getId() == id) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item add(Item item) {
        item.setId(ids++);
        //items[size++] = item;
        items.add(item);
        size++;
        return item;
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        //return index != -1 ? items[index] : null;
        return index != -1 ? items.get(index) : null;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[size];
        for (int index = 0; index < size; index++) {
            //rsl[index] = items[index];
            rsl[index] = items.get(index);
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int len = 0;
        for (int index = 0; index < size; index++) {
            //if (items[index].getName().equals(key)) {
                //rsl[len] = items[index];
            if (items.get(index).getName().equals(key)) {
                rsl[len] = items.get(index);
                len++;
            }
        }
        rsl = Arrays.copyOf(rsl, len);
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            //items[index] = item;
            items.add(index, item);
        }
        return rsl;
    }

    public void delete(int id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            //System.arraycopy(items, index + 1, items, index, size - index - 1);
            // items[size - 1] = null;
            items.remove(size - 1);
            size--;
        }
    }
}