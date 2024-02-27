package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    /* преобразовать список с массивом чисел в список чисел.      */
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] lists : list) {
            for (Integer number : lists) {
                result.add(number);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        List<String[]> names = new ArrayList<>();
        names.add(new String[] {"Petr", "Arsentev"});
        for (String[] row : names) {
            for (String cell : row) {
                System.out.println(cell);
            }
        }
    }
}
