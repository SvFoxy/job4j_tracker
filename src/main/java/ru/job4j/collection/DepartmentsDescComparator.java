package ru.job4j.collection;

import java.util.*;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String l = left.split("/")[0];
        String r = right.split("/")[0];
        int result = r.compareTo(l);
        return result == 0 ? left.compareTo(right) : result;
    }
}