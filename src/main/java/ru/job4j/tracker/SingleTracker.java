package ru.job4j.tracker;

import java.util.Arrays;

public final class SingleTracker {
    private Tracker tracker = new Tracker();

   /* <-- Тут реализовать синглетон класса SingleTracker.*/
   private static SingleTracker link  = null;

    private SingleTracker() {
    }

    private static SingleTracker getLink() {
        if (link == null) {
            link = new SingleTracker();
        }
        return link;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    /* Остальные методы из класса Tracker. */
    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public void delete(int id) {
        tracker.delete(id);
    }
}