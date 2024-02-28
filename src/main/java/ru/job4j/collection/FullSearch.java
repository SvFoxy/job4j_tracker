package ru.job4j.collection;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class FullSearch {

    public Set<String> extractNumber(List<Task> tasks) {
        Set<String> names = new HashSet<>();
        for (Task task : tasks) {
            names.add(task.getNumber());
        }
        return names;
    }
}
