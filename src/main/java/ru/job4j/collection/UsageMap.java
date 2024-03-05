package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("sveta@mail.ru", "Frolova Svetlana A");
        map.put("stas@mail.ru", "Korobeinikov Stas");
        map.put("stas@mail.ru", "Stas");
        map.put("petr@mail.ru", "Arsentiev Petr");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
