package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ItemAscByNameTest {
    @Test
    void compareItemAscByName() {
        List<Item> items = Arrays.asList(
                new Item("A"),
                new Item("C"),
                new Item("B")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("A"),
                new Item("B"),
                new Item("C")
        );
        assertThat(items).isEqualTo(expected);
    }
}