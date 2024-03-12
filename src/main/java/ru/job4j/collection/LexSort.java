package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        Integer intLeft = Integer.parseInt(left.split("\\.")[0]);
        Integer intRight = Integer.parseInt(right.split("\\.")[0]);
        return intLeft.compareTo(intRight);
    }

}

