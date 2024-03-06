package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemAscByNameTest {
    @Test
    void compareItemAscByName() {
        List<Item> items = new ArrayList<>();
        items.add(0, new Item("A"));
        items.add(1, new Item("C"));
        items.add(2, new Item("B"));
        List<Item> expected = new ArrayList<>();
        expected.add(items.get(0));
        expected.add(items.get(2));
        expected.add(items.get(1));
        items.sort(new ItemAscByName());
        assertThat(items).isEqualTo(expected);
    }
}