package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ItemDescByNameTest {

    @Test
    void compareItemDescByName() {

        List<Item> items = Arrays.asList(
                new Item("A"),
                new Item("C"),
                new Item("B")
        );
        items.sort(new ItemDescByName());

        List<Item> expected = Arrays.asList(
                new Item("C"),
                new Item("B"),
                new Item("A")
        );
        /*
        List<Item> items = new ArrayList<>();
        items.add(0, new Item("A"));
        items.add(1, new Item("C"));
        items.add(2, new Item("B"));
        List<Item> expected = new ArrayList<>();
        expected.add(items.get(1));
        expected.add(items.get(2));
        expected.add(items.get(0));
        items.sort(new ItemDescByName());*/
        assertThat(items).isEqualTo(expected);
    }
}