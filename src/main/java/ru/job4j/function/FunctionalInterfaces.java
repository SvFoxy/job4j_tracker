package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        List<String> list = List.of("one", "two", "three", "four", "five", "six", "seven");
        int i = 1;
        BiConsumer<Integer, String> biConsumer = (first, secont) -> map.put(first, secont);
        for (String string : list) {
            biConsumer.accept(i++, string);
        }
        BiPredicate<Integer, Integer> biPredicate = (key, length) -> key % 2 == 0 || length == 4;
        for (Integer key : map.keySet()) {
            if (biPredicate.test(key, map.get(key).length())) {
                System.out.println("key: " + key + " value: " + map.get(key));
            }
        }
        Supplier<List<String>> supplier = () -> new ArrayList<>(map.values());
        Consumer<String> consumer = (string) -> System.out.println(string);
        Function<String, String> function = string -> string.toUpperCase();
        for (String string : supplier.get()) {
            consumer.accept(function.apply(string));
        }
    }
}