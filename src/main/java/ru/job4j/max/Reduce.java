package ru.job4j.max;
//1. Код ниже содержит ошибку. Код должен вывести на экран массив,
// который мы передали в метод to(...).
//Метод to(..) должен записать аргумент array в поле класса.
public class Reduce {
    private int[] array;

    public void to(int[] arrayTo) {
        array = arrayTo;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}